package com.ju.japro.structalg.seven;

import static com.ju.japro.common.util.Print.print;

class Insect {
	private int i = 9;
	protected int j;
	Insect() {
		print("i = " + i + " , j = " + j);
		j = 39;
	}
	private static int x1 = printInit("static Insect.x1 initialized");
	static int printInit(String s) {
		print(s);
		return 47;
	}
}

class TestStatic {
	static int i = 19;
	static {
		print(i);
	}
}

public class Beetle extends Insect{
//	private int k = printInit("Bettle.k initialized");
	
	public Beetle () {
//		print("k = " + k);
//		print("j = " + j);
	}
	
//	private static int x2 = printInit("static Bettle.x2 initialized");
	
	public static void main(String[] args) {
		//print("Bettle consturctor");
		//Beetle b = new Beetle();
	}
}