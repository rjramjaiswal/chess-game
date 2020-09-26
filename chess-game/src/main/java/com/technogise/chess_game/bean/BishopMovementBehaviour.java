package com.technogise.chess_game.bean;

/**
 * @author ram
 *
 */
public class BishopMovementBehaviour extends MovementBehaviour{

	@Override
	public void addMovements() {
		
		DiagonalMovement move=new DiagonalMovement(Movement.MAX_STEP, true);
		addMovement(move);
	}

}
