package com.technogise.chess_game.bean;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ram
 *
 */
public class TwoAndHalfMovement extends Movement{
	
	
	public TwoAndHalfMovement(int noOfStep, boolean isEnabledInBothDirection) {
		super(noOfStep, isEnabledInBothDirection);
	}

	@Override
	public List<Square> getValidMovesForUpwardDirection(Board board, int x, int y, Color characterColor) {
		
		List<Square> validMoves=new ArrayList<>();
		
		int x1 =x-2;
		int y1 =y+1;
		addValidMoves(board, x1, y1, characterColor, validMoves);
		
		x1=x-2;
		y1=y-1;
		addValidMoves(board, x1, y1, characterColor, validMoves);
		
		
		x1=x-1;
		y1=y+2;
		addValidMoves(board, x1, y1, characterColor, validMoves);
		
		x1=x-1;
		y1=y-2;
		addValidMoves(board, x1, y1, characterColor, validMoves);
		
		
		return validMoves;
	}

	@Override
	public List<Square> getValidMovesDownwardDirection(Board board, int x, int y, Color characterColor) {
		
		List<Square> validMoves=new ArrayList<>();
		
		int x1 =x+2;
		int y1 =y-1;
		addValidMoves(board, x1, y1, characterColor, validMoves);
		
		x1=x+2;
		y1=y+1;
		addValidMoves(board, x1, y1, characterColor, validMoves);
		
		
		x1=x+1;
		y1=y+2;
		addValidMoves(board, x1, y1, characterColor, validMoves);
		
		x1=x+1;
		y1=y-2;
		addValidMoves(board, x1, y1, characterColor, validMoves);
		
		
		return validMoves;
	}

}
