package com.technogise.chess_game.bean;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BoardTest {

	Board board;

	@BeforeEach
	void setUp() throws Exception {
		board = new Board(Color.WHITE, Color.BLACK);
	}

	@Test
	void testBoard() {
		assertNotNull(board);
		assertEquals(board.getaSideColor(), Color.WHITE);
		assertEquals(board.getbSideColor(), Color.BLACK);
	}

	@Test
	void testSetColorSide() {
		board.setColorSide(Color.BLACK, Color.WHITE);
		assertEquals(board.getaSideColor(), Color.BLACK);
		assertEquals(board.getbSideColor(), Color.WHITE);
	}

	@Test
	void testGetName() {

		assertEquals("A8", board.getName(0, 0));
		assertEquals("H1", board.getName(7, 7));
		assertEquals("E4", board.getName(4, 4));
	}

	@Test
	void testGetNameForNull() {
		assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
			board.getName(9, 0);
		});
		
		assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
			 board.getName(0, 9);
		});
		
		assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
			board.getName(-1, -1);
		});
	}

	@Test
	void testDisplayBoard() {
		board.displayBoard();
	}

	@Test
	void testGetSquare() {
		Square square = board.getSquare("A8");
		assertNotNull(square);
		assertEquals(0, square.getX());
		assertEquals(0, square.getY());

	}

	@Test
	void testGetSquareOutOfBound() {
		Square square = board.getSquare("A9");
		assertNull(square);

	}

	@Test
	void testGetSquareByIndex() {
		Square squareByIndex = board.getSquareByIndex("01");
		assertNotNull(squareByIndex);
		assertEquals(0, squareByIndex.getX());
		assertEquals(1, squareByIndex.getY());
		assertEquals("B8", squareByIndex.getName());
	}

	@Test
	void testGetSquareByIndexOutOfBound() {
		Square squareByIndex = board.getSquareByIndex("99");
		assertNull(squareByIndex);

	}

	@Test
	void testGetaSideColor() {
		assertEquals(Color.WHITE, board.getaSideColor());
	}

	@Test
	void testGetbSideColor() {
		assertEquals(Color.BLACK, board.getbSideColor());
	}

}
