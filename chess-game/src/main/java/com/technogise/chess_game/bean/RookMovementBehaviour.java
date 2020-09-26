package com.technogise.chess_game.bean;

/**
 * @author ram
 *
 */
public class RookMovementBehaviour extends MovementBehaviour {

	@Override
	public void addMovements() {
		VerticalMovement vMove = new VerticalMovement(Movement.MAX_STEP, true);
		HorizontalMovement hMove = new HorizontalMovement(Movement.MAX_STEP, true);

		addMovement(vMove);
		addMovement(hMove);

	}

}
