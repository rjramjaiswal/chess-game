package com.technogise.chess_game.bean;

/**
 * @author ram
 *
 */
public class KingMovementBehaviour extends MovementBehaviour{

	@Override
	public void addMovements() {
	   VerticalMovement vMove=new VerticalMovement(Movement.MIN_STEP, true);
	   HorizontalMovement hMove=new HorizontalMovement(Movement.MIN_STEP, true);
	   DiagonalMovement dMove=new DiagonalMovement(Movement.MIN_STEP, true);
	   
	   addMovement(vMove);
	   addMovement(hMove);
	   addMovement(dMove);
	   
	}

}
