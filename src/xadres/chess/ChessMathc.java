package xadres.chess;

import xadres.application.bordgame.Board;
import xadres.application.bordgame.Piece;
import xadres.application.bordgame.Position;
import xadres.chess.pieces.King;
import xadres.chess.pieces.Rook;

public class ChessMathc {

	private Board board;

	public ChessMathc() {
		board = new Board(8, 8);
		initialSetup();
	}

	public ChessPiece[][] getPieces() {
		ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
		for (int i = 0; i < board.getRows(); i++) {
			for (int j = 0; j < board.getColumns(); j++) {
				mat[i][j] = (ChessPiece) board.piece(i, j);
			}
		}
		return mat;
	}
	private void placeNewPiece(char column, int row, ChessPiece piece) {
		board.placePiece(piece, new ChessPosition(column, row).toPosition());
	}
	
	private void initialSetup() {
		placeNewPiece('b',6 ,new Rook(board, Color.WHITH));
		placeNewPiece('e',8 ,new King(board, Color.BLACK));
		placeNewPiece('e',1 ,new King(board, Color.WHITH));
	}
	
}
