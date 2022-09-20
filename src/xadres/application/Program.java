package xadres.application;

import java.util.InputMismatchException;
import java.util.Scanner;

import xadres.application.bordgame.exceptions.ChessExceptions;
import xadres.chess.ChessMathc;
import xadres.chess.ChessPiece;
import xadres.chess.ChessPosition;

public class Program {

	public static void main(String[] args) {

		// instanciando um tabuleiro
		ChessMathc cm = new ChessMathc();
		Scanner sc = new Scanner(System.in);
		while (true) {
			try {

				UI.clearScreen();
				UI.printBoard(cm.getPieces());
				System.out.println();
				System.out.print("Source: ");
				ChessPosition source = UI.readChessPosition(sc);

				System.out.println();
				System.out.print("Target: ");
				ChessPosition target = UI.readChessPosition(sc);

				ChessPiece capturedPiece = cm.performChessMove(source, target);

			} catch (ChessExceptions e) {
				System.out.println(e.getMessage());
				sc.nextLine();
			} catch (InputMismatchException e) {
				System.out.println(e.getMessage());
				sc.nextLine();
			}

		}
	}

}
