package com.technogise.chess_game.bean;


/**
 * @author ram
 *
 */
public abstract class Piece {
	private String name;
	private Color color;
	private boolean alive;
	private MovementBehaviour movementBehaviour;


	public Piece(String name, Color color, boolean alive) {
		super();
		this.name = name;
		this.color = color;
		this.alive = alive;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public boolean isAlive() {
		return alive;
	}

	public void setAlive(boolean alive) {
		this.alive = alive;
	}

	public MovementBehaviour getMovementBehaviour() {
		return movementBehaviour;
	}

	public void setMovementBehaviour(MovementBehaviour movementBehaviour) {
		this.movementBehaviour = movementBehaviour;
	}
	
}
