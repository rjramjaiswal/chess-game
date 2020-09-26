package com.technogise.chess_game.bean;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ram
 *
 */
public abstract class Movement {
	
	public static final int MAX_STEP = 8;
	public static final int MIN_STEP = 1;
	private int noOfStep;
	private boolean isEnabledInBothDirection;
	
	enum DefaultMovementType{UPWARD, DOWNWARD}
	
    
	public Movement(int noOfStep, boolean isEnabledInBothDirection) {
		super();
		this.noOfStep = noOfStep;
		this.isEnabledInBothDirection = isEnabledInBothDirection;
	}
	
	/**
	 * @param board
	 * @param postionName
	 * @param characterColor
	 * @return List of valid moves
	 */
	public final  List<Square> getValidMoves(Board board,String postionName,Color characterColor){
		Square currPost = board.getSquare(postionName);
		int x = currPost.getX();
		int y = currPost.getY();
		DefaultMovementType movementType = getDefaultMovementType(characterColor, board);
		
		if(this.isEnabledInBothDirection()) {
			return getValidMovesForBiderectional(board, x, y, characterColor);
		}

		if (movementType == DefaultMovementType.UPWARD) {
			return getValidMovesForUpwardDirection(board, x, y, characterColor);
		}else {
			return getValidMovesDownwardDirection(board, x, y, characterColor);
		}
	}
	
	/**
	 * @param board
	 * @param x
	 * @param y
	 * @param characterColor
	 * @return list of valid moves in upwardDirection or right direction in case of horizontal moves
	 */
	public abstract List<Square> getValidMovesForUpwardDirection(Board board, int x, int y, Color characterColor);
	
	
	/**
	 * @param board
	 * @param x
	 * @param y
	 * @param characterColor
	 * @return list of valid moves in downwardDirection and left direction in case of vertical moves
	 */
	public abstract List<Square> getValidMovesDownwardDirection(Board board, int x, int y, Color characterColor);

	
	/**
	 * @param positionName
	 * @return index for postionName. Eg(if PostionName=A1 indexes[0,0] and PostionName=H1 then indexes[7,7]
	 */
	public int[] indexes(String positionName) {
		int[] arr=new int[2];
		char[] chArr=positionName.toCharArray();
		arr[0]=Integer.parseInt(chArr[1]+"");
		arr[1]=chArr[0]-65;
		
		return arr;	
	}
	
	/**
	 * @param characterColor
	 * @param board
	 * @return the movement is upward or downward in chess board depend on the color of piece
	 */
	public DefaultMovementType getDefaultMovementType(Color characterColor, Board board) {
		if(characterColor.equals(board.getaSideColor())) {
			return DefaultMovementType.UPWARD;
		}else {
			return DefaultMovementType.DOWNWARD;
		}
	}
	
	/**
	 * @param board
	 * @param x
	 * @param y
	 * @param characterColor
	 * @param validMoves
	 * @return true if there is next valid moves else return false
	 */
	public boolean addValidMoves(Board board,int x, int y, Color characterColor, List<Square> validMoves) {
		if(x>7 || y>7 || x<0 || y<0) {
			return false;
		}
		
		Square newSquare = board.getSquareByIndex(x + "" + y);
		if (newSquare.isEmpty()) {
			validMoves.add(newSquare);
			return true;
		} else if (newSquare.getPeice().getColor() == characterColor) {
			return false;
		} else {
			validMoves.add(newSquare);
			return false;
		}
	}
	
	
	
	/**
	 * @param board
	 * @param x
	 * @param y
	 * @param characterColor
	 * @return if the piece is bidirectional then it can move in both direction upward/downward or left/right
	 */
	public List<Square> getValidMovesForBiderectional(Board board, int x, int y, Color characterColor) {
		List<Square> validMoves = new ArrayList<>();

		validMoves.addAll(getValidMovesDownwardDirection(board, x, y, characterColor));
		validMoves.addAll(getValidMovesForUpwardDirection(board, x, y, characterColor));
		
		return validMoves;
	}
	
	public int getNoOfStep() {
		return noOfStep;
	}

	public void setNoOfStep(int noOfStep) {
		this.noOfStep = noOfStep;
	}

	public boolean isEnabledInBothDirection() {
		return isEnabledInBothDirection;
	}

	public void setEnabledInBothDirection(boolean isEnabledInBothDirection) {
		this.isEnabledInBothDirection = isEnabledInBothDirection;
	}

	public static int getMaxStep() {
		return MAX_STEP;
	}

	public static int getMinStep() {
		return MIN_STEP;
	}
	
}
