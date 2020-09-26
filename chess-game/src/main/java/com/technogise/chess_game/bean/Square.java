package com.technogise.chess_game.bean;

/**
 * @author ram
 *
 */
public class Square {

	private Piece peice;
	private int x;
	private int y;
	private String name;
	private Color color;
	
	public Square(int x,int y) {
		this.x=x;
		this.y=y;
		this.name=x+""+y;
		//this.name=String.valueOf((char) (x+65))+(y+1);
		this.name= String.valueOf((char) (y+65))+(8-x);
	}

	public Piece getPeice() {
		return peice;
	}

	public void setPeice(Piece peice) {
		this.peice = peice;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public String getName() {
        return name;
	}

	public boolean isEmpty() {
		if (peice == null) {
			return true;
		}
		return false;
	}
	
	public Color getColor() {
		return color;
	}
	
	public void setColor(Color color) {
		this.color = color;
	}

}
