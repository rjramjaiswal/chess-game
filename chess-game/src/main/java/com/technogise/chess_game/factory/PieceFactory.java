package com.technogise.chess_game.factory;

import com.technogise.chess_game.bean.Bishop;
import com.technogise.chess_game.bean.Color;
import com.technogise.chess_game.bean.Horse;
import com.technogise.chess_game.bean.King;
import com.technogise.chess_game.bean.Pawn;
import com.technogise.chess_game.bean.Piece;
import com.technogise.chess_game.bean.Queen;
import com.technogise.chess_game.bean.Rook;

public class PieceFactory {
	
	private MovementBehaviourFactory behaviourFactory=new MovementBehaviourFactory();
	
	public Piece getPeice(Class<? extends Piece> clazz, Color color) {
		Piece piece=null;
		if(King.class.equals(clazz)) {
			piece=new King("King", color, true);
		}else if(Queen.class.equals(clazz)) {
			piece=new Queen("Queen", color, true);
		}else if(Rook.class.equals(clazz)) {
			piece=new Rook("Rook", color, true);
		}else if(Bishop.class.equals(clazz)) {
			piece=new Bishop("Bishop", color, true);
		}else if(Horse.class.equals(clazz)) {
			piece=new Horse("Horse", color, true);
		}else if(Pawn.class.equals(clazz)) {
			piece=new Pawn("Pawn", color, true);
		}
		piece.setMovementBehaviour(behaviourFactory.getMovementBehaviour(clazz));
		return piece;
	}
	
	/**
	 * @param type
	 * @return
	 */
	public Piece getPeice(String type, Color color) {
		Class<? extends Piece> clazz=null;
		if("King".equalsIgnoreCase(type)) {
			clazz=King.class;
		}else if("Queen".equalsIgnoreCase(type)) {
			clazz=Queen.class;
		}else if("Rook".equalsIgnoreCase(type)) {
			clazz=Rook.class;
		}else if("Bishop".equalsIgnoreCase(type)) {
			clazz=Bishop.class;
		}else if("Horse".equalsIgnoreCase(type)) {
			clazz=Horse.class;
		}else if("Pawn".equalsIgnoreCase(type)) {
			clazz=Pawn.class;
		}
		return getPeice(clazz, color);
	}
	  
	

}
