package com.piloto1.Chess;

import com.piloto1.Chess.Board.Board;
import com.piloto1.Chess.GameFlow.GameFlow;

public class main {
	public static void main(String[] args) {
		Board game = new Board();
		GameFlow gameControl = new GameFlow();
		
		game.createBoard();
		game.displayBoard();
		
		int turn = 1;
		while(true) {
			if(turn == 1) {
				game.board = gameControl.makeMove(game, "White");
				game.displayBoard();
				turn *= -1;
				
			} else {
				game.board = gameControl.makeMove(game, "Black");
				game.displayBoard();
				turn *= -1;
			}
		}
	}
}

