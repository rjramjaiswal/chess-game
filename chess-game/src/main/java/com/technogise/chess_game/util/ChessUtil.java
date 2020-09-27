package com.technogise.chess_game.util;

import java.util.List;
import java.util.stream.Collectors;

import com.technogise.chess_game.bean.Square;

public class ChessUtil {
	
	public static List<String> getPositionList(List<Square> list){
		return list.stream().map(a->a.getName()).collect(Collectors.toList());
	}
	
	public static String getAllPossiblePositionAsString(List<Square> moves) {
    	return getPositionList(moves).stream().collect(Collectors.joining(","));
    }

}
