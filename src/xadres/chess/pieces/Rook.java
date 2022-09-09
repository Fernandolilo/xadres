package xadres.chess.pieces;

import xadres.application.bordgame.Board;
import xadres.chess.ChessPiece;
import xadres.chess.Color;

public class Rook extends ChessPiece{

	public Rook(Board board, Color color) {
		super(board, color);
		
	}

	@Override
	public String toString() {
		return "R";
	}
	
}
