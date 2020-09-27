package com.technogise.chess_game.factory;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.technogise.chess_game.bean.Bishop;
import com.technogise.chess_game.bean.Color;
import com.technogise.chess_game.bean.Horse;
import com.technogise.chess_game.bean.King;
import com.technogise.chess_game.bean.Pawn;
import com.technogise.chess_game.bean.Piece;
import com.technogise.chess_game.bean.Queen;
import com.technogise.chess_game.bean.Rook;


class PieceFactoryTest {
	
	private PieceFactory factory=new PieceFactory();

	@Test
	public void testGetPieceForKing() {
		Piece peice = factory.getPeice(King.class, Color.BLACK);
		assertEquals(King.class, peice.getClass());
		
	}

	@Test
	public void testGetPieceForKingType() {
		Piece peice = factory.getPeice("King", Color.BLACK);
		assertEquals(King.class, peice.getClass());
	}
	
	@Test
	public void testGetPieceForQueen() {
		Piece peice = factory.getPeice(Queen.class, Color.BLACK);
		assertEquals(Queen.class, peice.getClass());
		
	}

	@Test
	public void testGetPieceForQueenType() {
		Piece peice = factory.getPeice("Queen", Color.BLACK);
		assertEquals(Queen.class, peice.getClass());
	}
	
	@Test
	public void testGetPieceForBishop() {
		Piece peice = factory.getPeice(Bishop.class, Color.BLACK);
		assertEquals(Bishop.class, peice.getClass());
		
	}

	@Test
	public void testGetPieceForBishopType() {
		Piece peice = factory.getPeice("Bishop", Color.BLACK);
		assertEquals(Bishop.class, peice.getClass());
	}
	
	@Test
	public void testGetPieceForRook() {
		Piece peice = factory.getPeice(Rook.class, Color.BLACK);
		assertEquals(Rook.class, peice.getClass());
		
	}

	@Test
	public void testGetPieceForRookType() {
		Piece peice = factory.getPeice("Rook", Color.BLACK);
		assertEquals(Rook.class, peice.getClass());
	}
	
	@Test
	public void testGetPieceForHorse() {
		Piece peice = factory.getPeice(Horse.class, Color.BLACK);
		assertEquals(Horse.class, peice.getClass());
		
	}

	@Test
	public void testGetPieceForHorseType() {
		Piece peice = factory.getPeice("Horse", Color.BLACK);
		assertEquals(Horse.class, peice.getClass());
	}
	
	@Test
	public void testGetPieceForPawn() {
		Piece peice = factory.getPeice(Pawn.class, Color.BLACK);
		assertEquals(Pawn.class, peice.getClass());
		
	}

	@Test
	public void testGetPieceForPawnType() {
		Piece peice = factory.getPeice("Pawn", Color.BLACK);
		assertEquals(Pawn.class, peice.getClass());
	}

}
