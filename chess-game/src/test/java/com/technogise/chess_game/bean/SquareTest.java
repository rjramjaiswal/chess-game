package com.technogise.chess_game.bean;

import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SquareTest {
	
	private Square square;

	@BeforeEach
	void setUp() throws Exception {
		square=new Square(0, 0);
		square.setColor(Color.WHITE);
	}

	@Test
	void testGetPeice() {
		assertNull(square.getPeice());
	}

	@Test
	void testSetPeice() {
		square.setPeice(new Rook("Rook", Color.WHITE,true));
		assertNotNull(square.getPeice());
	}

	@Test
	void testGetX() {
		assertEquals(0, square.getX());
	}

	@Test
	void testGetY() {
		assertEquals(0, square.getY());
	}

	@Test
	void testGetName() {
		assertEquals("A8", square.getName());
	}

	@Test
	void testIsEmpty() {
		assertEquals(true, square.isEmpty());
	}

	@Test
	void testGetColor() {
		assertEquals(Color.WHITE, square.getColor());
	}

	@Test
	void testSetColor() {
		square.setColor(Color.BLACK);
		assertEquals(Color.BLACK, square.getColor());
	}

}
