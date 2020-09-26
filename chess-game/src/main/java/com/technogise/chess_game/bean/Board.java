package com.technogise.chess_game.bean;

import java.util.HashMap;

/**
 * @author ram
 *
 */
public class Board {

	private final Square[][] squares=new Square[8][8];
	private Color aSideColor;
	private Color bSideColor;
	private HashMap<String, Square> indexMap=new HashMap<>();
	private HashMap<String, Square> positionMap=new HashMap<>();
	
	public Board(Color aSide, Color bSide) {
		this.aSideColor=aSide;
		this.bSideColor=bSide;
		
		for(int i=0;i<8;i++) {
			for(int j=0;j<8;j++) {
				Square sq=new Square(i, j);
				squares[i][j]=sq;
				positionMap.put(sq.getName(), sq);
				indexMap.put(i+""+j, sq);
			}
		}
	}
	
	public void setColorSide(Color aSide, Color bSide) {
		this.aSideColor=aSide;
		this.bSideColor=bSide;
	}
	
	public Square getName(int x,int y) {
		if(x>=8 || y>=8) {
			//throw Exception
		}
		return squares[x][y];
	}
	
	/**
	 * display the board in 8X8 with position name
	 */
	public void displayBoard() {
		for(Square[] sqArr:squares) {
			for(Square sq:sqArr) {
				System.out.print(sq.getName()
						//+"_"+sq.getX()+""+sq.getY()
						+"    "
						);
			}
			System.out.println();
		}
	}
	
	public Square getSquare(String postionName) {
		return positionMap.get(postionName);
	}
	
	public Square getSquareByIndex(String index) {
		return indexMap.get(index);
	}
	
	public Color getaSideColor() {
		return aSideColor;
	}
	
	public Color getbSideColor() {
		return bSideColor;
	}

	
}
