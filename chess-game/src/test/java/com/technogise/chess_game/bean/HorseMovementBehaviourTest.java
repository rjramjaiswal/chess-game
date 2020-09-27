package com.technogise.chess_game.bean;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.technogise.chess_game.util.ChessUtil;

class HorseMovementBehaviourTest {
	

	private MovementBehaviour behaviour;
	private static Board board;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		board = new Board(Color.WHITE, Color.BLACK);
	}

	@BeforeEach
	void setUp() throws Exception {
		behaviour=new HorseMovementBehaviour();
	}

	@Test
	void testGetAllPossibleMoves() {
		List<Square> validMoves =behaviour.getAllPossibleMoves(board, "E4", Color.WHITE);
		List<String> validMovesPos=ChessUtil.getPositionList(validMoves);
		List<String> expectedPos=Arrays.asList("F6","D6","D2","F2","G5","G3","C5","C3" );
		
		assertEquals(8,validMoves.size());
		assertEquals(validMovesPos.containsAll(expectedPos), true);
	}

	@Test
	void testGetMovements() {
		assertEquals(1, behaviour.getMovements().size());
	}

}
