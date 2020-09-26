package com.technogise.chess_game.bean;

import java.util.ArrayList;
import java.util.List;


/**
 * @author ram
 *
 */
public class DiagonalMovement extends Movement {

	public DiagonalMovement(int noOfStep, boolean isEnabledInBothDirection) {
		super(noOfStep, isEnabledInBothDirection);
	}

	
	@Override
	public List<Square> getValidMovesForUpwardDirection(Board board, int x, int y, Color characterColor) {
		List<Square> validMoves = new ArrayList<>();
		
		for (int i = 1; i <= this.getNoOfStep(); i++) {
			int x1 = x - i;
			int y1 = y - i;

			if (!addValidMoves(board, x1, y1, characterColor, validMoves)) {
				break;
			}
		}
		
		for (int i = 1; i <= this.getNoOfStep(); i++) {
			int x1 = x - i;
			int y1 = y + i;

			if (!addValidMoves(board, x1, y1, characterColor, validMoves)) {
				break;
			}
		}
		
		return validMoves;
		
	}
	
	@Override
	public List<Square> getValidMovesDownwardDirection(Board board, int x, int y, Color characterColor) {
		List<Square> validMoves = new ArrayList<>();
		
		for (int i = 1; i <= this.getNoOfStep(); i++) {
			int x1 = x + i;
			int y1 = y + i;

			if (!addValidMoves(board, x1, y1, characterColor, validMoves)) {
				break;
			}
		}
		
		for (int i = 1; i <= this.getNoOfStep(); i++) {
			int x1 = x + i;
			int y1 = y - i;

			if (!addValidMoves(board, x1, y1, characterColor, validMoves)) {
				break;
			}
		}
		
		return validMoves;
		
	}

}
