package com.technogise.chess_game;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import com.technogise.chess_game.bean.Board;
import com.technogise.chess_game.bean.Color;
import com.technogise.chess_game.bean.Piece;
import com.technogise.chess_game.bean.Square;
import com.technogise.chess_game.factory.PieceFactory;
import com.technogise.chess_game.util.ChessUtil;

public class App {
	private static PieceFactory pieceFactory = new PieceFactory();
	private static Board board = new Board(Color.WHITE, Color.BLACK);

	public static void main(String[] args) {
		board.displayBoard();
		Scanner sc = new Scanner(System.in);
		String input = "";
		while (true) {
			try {
				System.out.print("Input-");
				input = sc.nextLine();
				if("STOP".equalsIgnoreCase(input) || "BYE".equalsIgnoreCase(input)){
					break;
				}
				System.out.println("Output: " + getAllPossiblePositionInString(input));
			} catch (Exception e) {
				System.out.print("Invalid Input! Please try again. Do you want to continue(Y/N) ? ");
				String ans=sc.nextLine();
				if("Y".equalsIgnoreCase(ans)) {
					break;
				}
				
			}
		}

	}

	public static String getAllPossiblePositionInString(String input) {
		String[] arr = input.split(" ");
		Piece piece = pieceFactory.getPeice(arr[0].trim(), Color.BLACK);
		List<Square> allPossibleMoves = piece.getMovementBehaviour().getAllPossibleMoves(board, arr[1],
				piece.getColor());
		return ChessUtil.getAllPossiblePositionAsString(allPossibleMoves);
	}
}
