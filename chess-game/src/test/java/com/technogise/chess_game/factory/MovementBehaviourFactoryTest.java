package com.technogise.chess_game.factory;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

import com.technogise.chess_game.bean.Bishop;
import com.technogise.chess_game.bean.BishopMovementBehaviour;
import com.technogise.chess_game.bean.Horse;
import com.technogise.chess_game.bean.HorseMovementBehaviour;
import com.technogise.chess_game.bean.King;
import com.technogise.chess_game.bean.KingMovementBehaviour;
import com.technogise.chess_game.bean.MovementBehaviour;
import com.technogise.chess_game.bean.Pawn;
import com.technogise.chess_game.bean.PawnMovementBehaviour;
import com.technogise.chess_game.bean.Queen;
import com.technogise.chess_game.bean.QueenMovementBehaviour;
import com.technogise.chess_game.bean.Rook;
import com.technogise.chess_game.bean.RookMovementBehaviour;

class MovementBehaviourFactoryTest {

	private MovementBehaviourFactory factory=new MovementBehaviourFactory();

	@Test
	public void testGetMovementBehaviour() {
		MovementBehaviourFactory myFactory=new MovementBehaviourFactory();
		assertNotNull(myFactory);
		
		MovementBehaviour movementBehaviour = myFactory.getMovementBehaviour(King.class);
		assertEquals(KingMovementBehaviour.class, movementBehaviour.getClass());
	}
	
	@Test
	public void testKingMovementBehaviourByName() {
		MovementBehaviour movementBehaviour = factory.getMovementBehaviour("King");
		assertEquals(KingMovementBehaviour.class, movementBehaviour.getClass());
	}
	
	@Test
	public void testQueenMovementBehaviourByClass() {
		MovementBehaviour movementBehaviour = factory.getMovementBehaviour(Queen.class);
		assertEquals(QueenMovementBehaviour.class, movementBehaviour.getClass());
	}
	
	@Test
	public void testQueenMovementBehaviourByName() {
		MovementBehaviour movementBehaviour = factory.getMovementBehaviour("Queen");
		assertEquals(QueenMovementBehaviour.class, movementBehaviour.getClass());
	}
	
	@Test
	public void testBishopMovementBehaviourByClass() {
		MovementBehaviour movementBehaviour = factory.getMovementBehaviour(Bishop.class);
		assertEquals(BishopMovementBehaviour.class, movementBehaviour.getClass());
	}
	
	@Test
	public void testBishopMovementBehaviourByName() {
		MovementBehaviour movementBehaviour = factory.getMovementBehaviour("Bishop");
		assertEquals(BishopMovementBehaviour.class, movementBehaviour.getClass());
	}
	
	@Test
	public void testRookMovementBehaviourByClass() {
		MovementBehaviour movementBehaviour = factory.getMovementBehaviour(Rook.class);
		assertEquals(RookMovementBehaviour.class, movementBehaviour.getClass());
	}
	
	@Test
	public void testRookMovementBehaviourByName() {
		MovementBehaviour movementBehaviour = factory.getMovementBehaviour("Rook");
		assertEquals(RookMovementBehaviour.class, movementBehaviour.getClass());
	}
	
	@Test
	public void testHorsekMovementBehaviourByClass() {
		MovementBehaviour movementBehaviour = factory.getMovementBehaviour(Horse.class);
		assertEquals(HorseMovementBehaviour.class, movementBehaviour.getClass());
	}
	
	@Test
	public void testHorseMovementBehaviourByName() {
		MovementBehaviour movementBehaviour = factory.getMovementBehaviour("Horse");
		assertEquals(HorseMovementBehaviour.class, movementBehaviour.getClass());
	}
	
	@Test
	public void testPawnMovementBehaviourByClass() {
		MovementBehaviour movementBehaviour = factory.getMovementBehaviour(Pawn.class);
		assertEquals(PawnMovementBehaviour.class, movementBehaviour.getClass());
	}
	
	@Test
	public void testPawnMovementBehaviourByName() {
		MovementBehaviour movementBehaviour = factory.getMovementBehaviour("Pawn");
		assertEquals(PawnMovementBehaviour.class, movementBehaviour.getClass());
	}

}
