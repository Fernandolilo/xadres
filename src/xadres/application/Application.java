package xadres.application;

import xadres.application.bordgame.Position;
import xadres.chess.ChessMathc;

public class Application {

	public static void main(String[] args) {
		
		//estanciando a posição das peças
		Position p = new Position(3,5);
		System.out.println(p);
		
		//instanciando um tabuleiro		
		ChessMathc cm = new ChessMathc();
		UI.printBoard(cm.getPieces());
		
	}

}
