package com.ju.japro.structalg.two;

import static com.ju.japro.structalg.two.util.Util.print;

public class Flower {
	int petalCount = 0;
	String s = "initial value";
	
	Flower(int petals) {
		petalCount = petals;
		print("Constructor w/ int arg only,petalCount = " + petalCount);
	}
	Flower(String ss) {
		print("Constructor w/ String arg only, s = " + ss);
		s = ss;
	}
	
	Flower(String s,int petals) {
		this(petals);
//		this(s);// Can't call two!
		this.s = s;
		print("String & int args");
	}
	Flower() {
		this("h1",47);
		print("default constructor (no args)");
	}
	
	void printPetalCount() {
//		this(11);
		print("petalCount = " + petalCount + ", s = " + s);
	}
	public static void main(String[] args) {
		Flower x = new Flower();
		x.printPetalCount();
	}
	
}