package com.ju.japro.structalg.ten.test;


interface A{}
interface B{}

class X implements A,B {}
class Y implements A {
	B makeB() {
		return new B(){};
	}
}

public class Parcal12 {
	static void tasksA(A a) {}
	static void tasksB(B b) {}
	
	public static void main(String[] args) {
		X x = new X();
		Y y = new Y();
		tasksA(x);
		tasksA(y);
		tasksB(x);
		tasksB(y.makeB());
	}
}