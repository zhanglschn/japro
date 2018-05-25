package com.ju.japro.structalg.ten.test;

class D{}
abstract class E{}

class Z extends D {
	E makeE () {
		return new E() {};
	}
}

public class Parcal13 {
	static void makeE(E e) {}
	static void makeD(D d) {}
	public static void main(String[] args) {
		Z z = new Z();
		makeE(z.makeE());
		makeD(z);
	}
}