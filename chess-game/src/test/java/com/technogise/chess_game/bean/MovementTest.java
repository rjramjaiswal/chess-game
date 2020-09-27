package com.technogise.chess_game.bean;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.technogise.chess_game.bean.Movement.DefaultMovementType;

class MovementTest {
	
	private static Board board;
	private Movement movement;
	

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		board=new Board(Color.WHITE, Color.BLACK);
		
	}

	@BeforeEach
	void setUp() throws Exception {
		movement=new VerticalMovement(1, true);
	}

	@Test
	void testIndexes() {
		int[] indexes = movement.indexes("A8");
		assertEquals(2,indexes.length);
		assertEquals(indexes[0], 0);
		assertEquals(indexes[1], 0);
	}

	@Test
	void testGetDefaultMovementType() {
		DefaultMovementType defaultMovementType = movement.getDefaultMovementType(Color.WHITE, board);
		assertEquals(DefaultMovementType.UPWARD, defaultMovementType);		
	}
	
	@Test
	void testGetDefaultMovementTypeOfOpponent() {
		DefaultMovementType defaultMovementType = movement.getDefaultMovementType(Color.BLACK, board);
		assertEquals(DefaultMovementType.DOWNWARD, defaultMovementType);		
	}

	@Test
	void testGetNoOfStep() {
		assertEquals(1, movement.getNoOfStep());
	}
	
	@Test
	void testMinStep() {
		assertEquals(1, Movement.getMinStep());
	}
	
	@Test
	void testMaxStep() {
		assertEquals(8, Movement.getMaxStep());
	}
	
	@Test
	void testNoOfSteps() {
		movement.setNoOfStep(6);
		assertEquals(6, movement.getNoOfStep());
	}
	
	@Test
	void testSetEnabledInBothDirection() {
		movement.setEnabledInBothDirection(false);
		assertEquals(false, movement.isEnabledInBothDirection());

	}

}
