package com.technogise.chess_game.bean;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ram
 *
 */
public class HorizontalMovement extends Movement {
	
	public HorizontalMovement(int noOfStep, boolean isEnabledInBothDirection) {
		super(noOfStep, isEnabledInBothDirection);
	}

	@Override
	public List<Square> getValidMovesForUpwardDirection(Board board, int x, int y, Color characterColor) {
		
		List<Square> validMoves=new ArrayList<>();
		
		for(int i=1;i<=getNoOfStep();i++) {
			int x1=x;
			int y1=y+i;
			
			if (!addValidMoves(board, x1, y1, characterColor, validMoves)) {
				break;
			}
		}
		return validMoves;
	}

	@Override
	public List<Square> getValidMovesDownwardDirection(Board board, int x, int y, Color characterColor) {
		List<Square> validMoves=new ArrayList<>();
		
		for(int i=1;i<=getNoOfStep();i++) {
			int x1=x;
			int y1=y-i;
			
			if (!addValidMoves(board, x1, y1, characterColor, validMoves)) {
				break;
			}
		}
		return validMoves;
	}
	

}
