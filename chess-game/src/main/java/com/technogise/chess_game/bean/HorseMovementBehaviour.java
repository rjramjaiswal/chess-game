package com.technogise.chess_game.bean;

/**
 * @author ram
 *
 */
public class HorseMovementBehaviour extends MovementBehaviour{

	@Override
	public void addMovements() {
		TwoAndHalfMovement mov=new TwoAndHalfMovement(Movement.MAX_STEP, true);
		addMovement(mov);
	}

}
