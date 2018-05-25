package com.ju.japro.structalg.ten.test;

public class Outer {
	class Inner {
		private int i = 11;
		public int value() {return i;}
	}
	
	public Inner to() {
		return new Inner();
	}
	
	public static void main(String[] args) {
		Outer outer = new Outer();
		Inner inner = outer.to();
		
	}
	
	
}