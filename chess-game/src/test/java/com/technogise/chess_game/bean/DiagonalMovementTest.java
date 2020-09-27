package com.technogise.chess_game.bean;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.technogise.chess_game.util.ChessUtil;

class DiagonalMovementTest {
	
	private static Board boardSideAasWhite;
	private Movement movementWithSingleStep;
	private Movement movementWithMaxStep;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {

		boardSideAasWhite = new Board(Color.WHITE, Color.BLACK);
	}

	@BeforeEach
	void setUp() throws Exception {
		movementWithSingleStep = new DiagonalMovement(Movement.MIN_STEP, true);
		movementWithMaxStep = new DiagonalMovement(Movement.MAX_STEP, true);
	}

	@Test
	void testGetValidMovesForUpwardDirectionAtUpwardCornerForSingleStep() {
		List<Square> list = movementWithSingleStep.getValidMovesForUpwardDirection(boardSideAasWhite, 0, 0,Color.WHITE);
		assertEquals(0, list.size());
		
	}

	@Test
	void testGetValidMovesForDownWardDirectionAtUpwardCornerForSingleStep() {
		List<Square> list = movementWithSingleStep.getValidMovesDownwardDirection(boardSideAasWhite, 0, 0, Color.WHITE);
		assertEquals(1, list.size());
		assertEquals("B7", list.get(0).getName());
	}
	
	@Test
	void testGetValidMovesForUpwardDirectionAtDownwardRightCornerForSingleStep() {
		List<Square> list = movementWithSingleStep.getValidMovesForUpwardDirection(boardSideAasWhite, 7, 7,Color.WHITE);
		assertEquals(1, list.size());
		assertEquals("G2", list.get(0).getName());
		
	}

	@Test
	void testGetValidMovesForDownWardDirectionAtDownwardCornerForSingleStep() {
		List<Square> list = movementWithSingleStep.getValidMovesDownwardDirection(boardSideAasWhite, 7, 7, Color.WHITE);
		assertEquals(0, list.size());
	}
	
	@Test
	void testGetValidMovesforUpwardLeftCornerWithSingleStep() {
		List<Square> validMoves = movementWithSingleStep.getValidMoves(boardSideAasWhite, "A8", Color.WHITE);
		List<String> validMovesPos=ChessUtil.getPositionList(validMoves);
		List<String> expectedPos=Arrays.asList("B7");
		assertEquals(validMovesPos.containsAll(expectedPos), true);
	}
	
	@Test
	void testGetValidMovesforUpwardLeftCornerWithMaxStep() {
		List<Square> validMoves = movementWithMaxStep.getValidMoves(boardSideAasWhite, "A8", Color.WHITE);
		List<String> validMovesPos=ChessUtil.getPositionList(validMoves);
		List<String> expectedPos=Arrays.asList("B7", "C6", "D5", "E4", "F3", "G2", "H1");
		assertEquals(validMovesPos.containsAll(expectedPos), true);
	}
	
	@Test
	void testGetValidMoves() {
		List<Square> validMoves = movementWithMaxStep.getValidMoves(boardSideAasWhite, "D5", Color.WHITE);
		List<String> validMovesPos=ChessUtil.getPositionList(validMoves);
		List<String> expectedPos=Arrays.asList("E6", "F7", "G8", "C4", "B3", "A2", "H1", "C6","B7","A8","E4","F3","G2");
		assertEquals(expectedPos.size(),validMovesPos.size());
		assertEquals(validMovesPos.containsAll(expectedPos), true);
	}

}
