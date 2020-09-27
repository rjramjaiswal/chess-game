package com.technogise.chess_game.bean;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.technogise.chess_game.util.ChessUtil;



class HorizontalMovementTest {

	private static Board boardSideAasWhite;
	private static Board boardSideAasBlack;
	private Movement movementWithSingleStep;
	private Movement movementWithMaxStep;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {

		boardSideAasWhite = new Board(Color.WHITE, Color.BLACK);
		boardSideAasBlack = new Board(Color.BLACK, Color.WHITE);
		boardSideAasBlack.displayBoard();
	}

	@BeforeEach
	void setUp() throws Exception {
		movementWithSingleStep = new HorizontalMovement(Movement.MIN_STEP, true);
		movementWithMaxStep = new HorizontalMovement(Movement.MAX_STEP, true);
	}

	@Test
	void testGetValidMovesForUpwardDirectionAtUpwardCornerForSingleStep() {
		List<Square> list = movementWithSingleStep.getValidMovesForUpwardDirection(boardSideAasWhite, 0, 0,
				Color.WHITE);
		assertEquals(1, list.size());
		assertEquals("B8", list.get(0).getName());
	}

	@Test
	void testGetValidMovesForDownWardDirectionAtUpwardCornerForSingleStep() {
		List<Square> list = movementWithSingleStep.getValidMovesDownwardDirection(boardSideAasWhite, 0, 0, Color.WHITE);
		assertEquals(0, list.size());
	}
	
	@Test
	void testGetValidMovesForUpwardDirectionAtDownwardRightCornerForSingleStep() {
		List<Square> list = movementWithSingleStep.getValidMovesForUpwardDirection(boardSideAasWhite, 7, 7,
				Color.WHITE);
		assertEquals(0, list.size());
		
	}

	@Test
	void testGetValidMovesForDownWardDirectionAtDownwardCornerForSingleStep() {
		List<Square> list = movementWithSingleStep.getValidMovesDownwardDirection(boardSideAasWhite, 7, 7, Color.WHITE);
		assertEquals(1, list.size());
		assertEquals("G1", list.get(0).getName());
	}
	
	@Test
	void testGetValidMovesforUpwardLeftCornerWithSingleStep() {
		List<Square> validMoves = movementWithSingleStep.getValidMoves(boardSideAasWhite, "A8", Color.WHITE);
		List<String> validMovesPos=ChessUtil.getPositionList(validMoves);
		List<String> expectedPos=Arrays.asList("B8");
		assertEquals(validMovesPos.containsAll(expectedPos), true);
	}
	
	@Test
	void testGetValidMovesforUpwardLeftCornerWithMaxStep() {
		List<Square> validMoves = movementWithMaxStep.getValidMoves(boardSideAasWhite, "A8", Color.WHITE);
		List<String> validMovesPos=ChessUtil.getPositionList(validMoves);
		List<String> expectedPos=Arrays.asList("B8","C8","D8","E8","F8","G8","H8");
		System.out.println(validMovesPos);
		assertEquals(validMovesPos.containsAll(expectedPos), true);
	}
	

}
