package com.technogise.chess_game.bean;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.technogise.chess_game.util.ChessUtil;

class PawnMovementBehaviourTest {
	
	private static Board board;
	private MovementBehaviour behaviour;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		board=new Board(Color.WHITE, Color.BLACK);
	}

	@BeforeEach
	void setUp() throws Exception {
		behaviour=new PawnMovementBehaviour();
	}

	@Test
	void testAddMovement() {
		behaviour.addMovement(new TwoAndHalfMovement(1, false));
		assertEquals(3, behaviour.getMovements().size());
	}

	@Test
	void testGetAllPossibleMoves() {
		List<Square> allPossibleMoves = behaviour.getAllPossibleMoves(board, "C5", Color.WHITE);
		List<String> moves=ChessUtil.getPositionList(allPossibleMoves);
		assertEquals(1, moves.size());
		assertEquals(true, moves.contains("C6"));
	}
	
	@Test
	void testGetAllPossibleMovesOfOpponent() {
		List<Square> allPossibleMoves = behaviour.getAllPossibleMoves(board, "C5", Color.BLACK);
		List<String> moves=ChessUtil.getPositionList(allPossibleMoves);
		assertEquals(1, moves.size());
		assertEquals(true, moves.contains("C4"));
	}

	@Test
	void testGetMovements() {
		assertEquals(2, behaviour.getMovements().size());
	}


}
