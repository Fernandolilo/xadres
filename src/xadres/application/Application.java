package xadres.application;

import xadres.chess.ChessMathc;

public class Application {

	public static void main(String[] args) {

		
		//instanciando um tabuleiro		
		ChessMathc cm = new ChessMathc();
		UI.printBoard(cm.getPieces());
		
	}

}
