package com.technogise.chess_game.bean;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.technogise.chess_game.util.ChessUtil;

class TwoAndHalfMovementTest {

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
		movementWithSingleStep = new TwoAndHalfMovement(Movement.MIN_STEP, true);
		movementWithMaxStep = new TwoAndHalfMovement(Movement.MAX_STEP, true);
	}

	@Test
	void testGetValidMovesForUpwardDirectionAtUpwardCornerForSingleStep() {
		List<Square> list = movementWithSingleStep.getValidMovesForUpwardDirection(boardSideAasWhite, 0, 0,Color.WHITE);
		assertEquals(0, list.size());
		
	}

	@Test
	void testGetValidMovesForDownWardDirectionAtUpwardCornerForSingleStep() {
		List<Square> list = movementWithSingleStep.getValidMovesDownwardDirection(boardSideAasWhite, 0, 0, Color.WHITE);
		assertEquals(2, list.size());
	}
	
	@Test
	void testGetValidMovesForUpwardDirectionAtDownwardRightCornerForSingleStep() {
		List<Square> list = movementWithSingleStep.getValidMovesForUpwardDirection(boardSideAasWhite, 7, 7,Color.WHITE);
		assertEquals(2, list.size());
	}

	@Test
	void testGetValidMovesForDownWardDirectionAtDownwardCornerForSingleStep() {
		List<Square> list = movementWithSingleStep.getValidMovesDownwardDirection(boardSideAasWhite, 7, 7, Color.WHITE);
		assertEquals(0, list.size());
	}
	
	@Test
	void testGetValidMoves() {
		List<Square> validMoves = movementWithMaxStep.getValidMoves(boardSideAasWhite, "E4", Color.WHITE);
		List<String> validMovesPos=ChessUtil.getPositionList(validMoves);
		List<String> expectedPos=Arrays.asList("F6","D6","D2","F2","G5","G3","C5","C3" );
		
		assertEquals(8,validMoves.size());
		assertEquals(validMovesPos.containsAll(expectedPos), true);
	}
	
	

}
