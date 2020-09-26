package com.technogise.chess_game.factory;

import com.technogise.chess_game.bean.Bishop;
import com.technogise.chess_game.bean.BishopMovementBehaviour;
import com.technogise.chess_game.bean.Horse;
import com.technogise.chess_game.bean.HorseMovementBehaviour;
import com.technogise.chess_game.bean.King;
import com.technogise.chess_game.bean.KingMovementBehaviour;
import com.technogise.chess_game.bean.MovementBehaviour;
import com.technogise.chess_game.bean.Pawn;
import com.technogise.chess_game.bean.PawnMovementBehaviour;
import com.technogise.chess_game.bean.Piece;
import com.technogise.chess_game.bean.Queen;
import com.technogise.chess_game.bean.QueenMovementBehaviour;
import com.technogise.chess_game.bean.Rook;
import com.technogise.chess_game.bean.RookMovementBehaviour;

public class MovementBehaviourFactory {
	
	public MovementBehaviour getMovementBehaviour(Class<? extends Piece> clazz) {
		MovementBehaviour moveBehaviour=null;
		if(King.class.equals(clazz)) {
			moveBehaviour=new KingMovementBehaviour();
		}else if(Queen.class.equals(clazz)) {
			moveBehaviour=new QueenMovementBehaviour();
		}else if(Rook.class.equals(clazz)) {
			moveBehaviour=new RookMovementBehaviour();
		}else if(Bishop.class.equals(clazz)) {
			moveBehaviour=new BishopMovementBehaviour();
		}else if(Horse.class.equals(clazz)) {
			moveBehaviour=new HorseMovementBehaviour();
		}else if(Pawn.class.equals(clazz)) {
			moveBehaviour=new PawnMovementBehaviour();
		}
		return moveBehaviour;
	}
	
	/**
	 * @param type
	 * @return
	 */
	public MovementBehaviour getMovementBehaviour(String type) {
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
		return getMovementBehaviour(clazz);
	}
	  

}
