package com.technogise.chess_game.bean;

import java.util.Iterator;
import java.util.List;

/**
 * @author ram
 *
 */
public class PawnMovementBehaviour extends MovementBehaviour{

	@Override
	public void addMovements() {
		VerticalMovement vMove=new VerticalMovement(Movement.MIN_STEP, false);
		DiagonalMovement dMove=new DiagonalMovement(Movement.MIN_STEP, false);
		
		addMovement(dMove);
		addMovement(vMove);
		
	}
	
	@Override
	public List<Square> getAllPossibleMoves(Board board, String postionName, Color characterColor) {
		
		List<Square> allPossibleMoves = super.getAllPossibleMoves(board, postionName, characterColor);
		Iterator<Square> itr=allPossibleMoves.iterator();
		while(itr.hasNext()) {
			Square sq=itr.next();
			if(!sq.isEmpty() && sq.getPeice().getColor().equals(characterColor)) {
				itr.remove();
			}
			if(sq.isEmpty() && postionName.charAt(0)!=sq.getName().charAt(0)){
				itr.remove();
			}
		}
		return allPossibleMoves;
	}

}
