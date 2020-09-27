package com.technogise.chess_game.bean;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PieceTest {
	
	private Piece piece;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		piece=new King("King", Color.WHITE, true);
	}

	@Test
	void testGetName() {
		assertEquals("King", piece.getName());
	}

	@Test
	void testSetName() {
		piece.setName("Dummy");
		assertEquals("Dummy", piece.getName());
	}

	@Test
	void testGetColor() {
		assertEquals(Color.WHITE, piece.getColor());
	}

	@Test
	void testSetColor() {
		piece.setColor(Color.BLACK);
		assertEquals(Color.BLACK, piece.getColor());
	}

	@Test
	void testIsAlive() {
		assertEquals(true, piece.isAlive());
	}

	@Test
	void testSetAlive() {
		piece.setAlive(false);
		assertEquals(false, piece.isAlive());
	}

	@Test
	void testGetMovementBehaviour() {
		MovementBehaviour movementBehaviour=new KingMovementBehaviour();
		piece.setMovementBehaviour(movementBehaviour);
		assertEquals(3, piece.getMovementBehaviour().getMovements().size());
		
	}


}
