package com.technogise.chess_game.bean;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.technogise.chess_game.util.ChessUtil;

class RookMovementBehaviourTest {

	private MovementBehaviour behaviour;
	private static Board board;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		board = new Board(Color.WHITE, Color.BLACK);
	}

	@BeforeEach
	void setUp() throws Exception {
		behaviour = new RookMovementBehaviour();

	}

	@Test
	void testGetAllPossibleMoves() {
		List<Square> allPossibleMoves = behaviour.getAllPossibleMoves(board, "A8", Color.WHITE);
		List<String> moves = ChessUtil.getPositionList(allPossibleMoves);

		List<String> expectedMoves = Arrays.asList("A7", "A6", "A5", "A4", "A3", "A2", "A1", "B8", "C8", "D8",
				"E8", "F8", "G8", "H8");
		
		assertEquals(true, expectedMoves.containsAll(moves));

	}

	@Test
	void testGetMovements() {
		assertEquals(2, behaviour.getMovements().size());
	}

}
