package com.ju.japro.main;

public class Main1 {
	public static void main(String[] args) {
		Incrementable.increment();
		p(StaticTest.X);
		StaticTest staticTest = new StaticTest();
		p(staticTest.X);
		StaticTest staticTest1 = new StaticTest();
		p(staticTest1.X);
	}

	public static void main1(String[] args) {
		long y = setX(1);
		p(y);

		short z = setY(20);
		p(z);

		float x = setX(1);
		double xz = setD(1);
	}

	public static void p(Object ob) {
		System.out.println(ob);
	}

	public static int setX(int x) {
		return x;
	}

	public static short setY(int y) {
		return (short) y;
	}

	public static double setD(int d) {
		return d;
	}
}

class Incrementable {
	static void increment() {
		StaticTest.X++;
	}
}

class StaticTest {
	static int X = 47;
}