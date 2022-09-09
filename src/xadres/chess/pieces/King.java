package xadres.chess.pieces;

import xadres.application.bordgame.Board;
import xadres.chess.ChessPiece;
import xadres.chess.Color;

public class King extends ChessPiece{

	public King(Board board, Color color) {
		super(board, color);
		
	}

	@Override
	public String toString() {
		return "K";
	}
	
}
