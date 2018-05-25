package com.ju.japro.structalg.five.app;

import com.ju.japro.structalg.five.Book;

public class TerminationCondition {
	public static void main(String[] args) {
		Book novel = new Book(true);
		novel.checkIn();
		new Book(true);
		System.gc();
	}
}
