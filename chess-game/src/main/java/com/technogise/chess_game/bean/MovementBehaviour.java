package com.technogise.chess_game.bean;

import java.util.ArrayList;
import java.util.List;


/**
 * @author ram
 *
 */
public abstract class MovementBehaviour {
	protected List<Movement> movements=new ArrayList<>();
	
	public MovementBehaviour() {
		addMovements();
	}
	
	/**
	 * All the all types of Movements
	 */
	public abstract void addMovements();
	
	/**
	 * @param board
	 * @param postionName
	 * @param characterColor
	 * @return the possible moves of for different list of movements
	 */
	public List<Square> getAllPossibleMoves(Board board,String postionName, Color characterColor ){
		List<Square> list= new ArrayList<>();
		
		for(Movement mov:movements) {
			list.addAll(mov.getValidMoves(board, postionName, characterColor));
		}
		return list;
	}
	
	public List<Movement> getMovements() {
		return movements;
	}
	
	public void addMovement(Movement movemennt) {
		movements.add(movemennt);
	}
	
	
	
}
