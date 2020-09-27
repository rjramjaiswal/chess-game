package com.technogise.chess_game.bean;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.technogise.chess_game.util.ChessUtil;

class BishopMovementBehaviourTest {
	
	private MovementBehaviour behaviour;
	private static Board board;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		board = new Board(Color.WHITE, Color.BLACK);
	}

	@BeforeEach
	void setUp() throws Exception {
		behaviour=new BishopMovementBehaviour();
	}

	
	@Test
	void testGetAllPossibleMoves() {
		List<Square> allPossibleMoves = behaviour.getAllPossibleMoves(board, "A8", Color.WHITE);
		List<String> moves=ChessUtil.getPositionList(allPossibleMoves);
		System.out.println(moves);
		List<String> expectedMoves=Arrays.asList("B7","C6","D5","E4","F3","G2","H1");
		assertEquals(7, allPossibleMoves.size());
		assertEquals(true,expectedMoves.containsAll(moves));
	}

	@Test
	void testGetMovements() {
		assertEquals(1, behaviour.getMovements().size());
	}

}
