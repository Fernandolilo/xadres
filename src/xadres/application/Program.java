package xadres.application;

import java.util.Scanner;

import xadres.chess.ChessMathc;
import xadres.chess.ChessPiece;
import xadres.chess.ChessPosition;

public class Program {

	public static void main(String[] args) {

		
		//instanciando um tabuleiro		
		ChessMathc cm = new ChessMathc();		
		Scanner sc = new Scanner(System.in);
		while (true) {
			UI.printBoard(cm.getPieces());
			System.out.println();
			System.out.print("Source: ");
			ChessPosition source = UI.readChessPosition(sc);

			System.out.println();
			System.out.print("Target: ");
			ChessPosition target = UI.readChessPosition(sc);

			ChessPiece capturedPiece = cm.performChessMove(source, target);
		}
		
	}

}
