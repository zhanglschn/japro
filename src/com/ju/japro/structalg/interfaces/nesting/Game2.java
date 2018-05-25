package com.ju.japro.structalg.interfaces.nesting;

import static com.ju.japro.common.util.Print.print;


interface Game1{
	boolean move();
}

interface Game1Factory {
	Game1 getGame();
}

class Checkers1 implements Game1 {
	private int moves = 0;
	private static final int MOVES = 3;
	private Checkers1(){}
	public boolean move() {
		print("Chess move " + moves);
		return ++moves != MOVES;
	}
	public static Game1Factory factory  = new Game1Factory() {
		public Game1 getGame() {
			return new Checkers1();
		}
	};
}

class Checkers2 implements Game1 {
	private int moves = 0;
	private static final int MOVES = 4;
	public boolean move() {
		print("Chess move " + moves);
		return ++moves != MOVES;
	}
	private Checkers2(){}
	public static Game1Factory factory = new Game1Factory() {
		public Game1 getGame() {
			return new Checkers2();
		}
	};
}


public class Game2 {
	public static void gameConsumer(Game1Factory fact) {
		Game1 game = fact.getGame();
		print(game.move());
	}
	
	public static void main(String[] args) {
		gameConsumer(Checkers1.factory);
		gameConsumer(Checkers2.factory);
	}
}
