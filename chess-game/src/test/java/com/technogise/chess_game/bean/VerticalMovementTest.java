package com.technogise.chess_game.bean;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.technogise.chess_game.util.ChessUtil;

class VerticalMovementTest {

	private static Board boardSideAasWhite;
	private Movement movementWithSingleStep;
	private Movement movementWithMaxStep;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {

		boardSideAasWhite = new Board(Color.WHITE, Color.BLACK);
	}

	@BeforeEach
	void setUp() throws Exception {
		movementWithSingleStep = new VerticalMovement(Movement.MIN_STEP, true);
		movementWithMaxStep = new VerticalMovement(Movement.MAX_STEP, true);
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
		assertEquals("A7", list.get(0).getName());
	}
	
	@Test
	void testGetValidMovesForUpwardDirectionAtDownwardRightCornerForSingleStep() {
		List<Square> list = movementWithSingleStep.getValidMovesForUpwardDirection(boardSideAasWhite, 7, 7,Color.WHITE);
		assertEquals(1, list.size());
		assertEquals("H2", list.get(0).getName());
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
		List<String> expectedPos=Arrays.asList("A7");
		assertEquals(validMovesPos.containsAll(expectedPos), true);
	}
	
	@Test
	void testGetValidMovesforUpwardLeftCornerWithMaxStep() {
		List<Square> validMoves = movementWithMaxStep.getValidMoves(boardSideAasWhite, "A8", Color.WHITE);
		List<String> validMovesPos=ChessUtil.getPositionList(validMoves);
		List<String> expectedPos=Arrays.asList("A7", "A6", "A5", "A4", "A3", "A2", "A1");
		assertEquals(validMovesPos.containsAll(expectedPos), true);
	}

}
