package com.ju.japro.structalg.ten;

import static com.ju.japro.common.util.Print.print;



abstract class Base {
	public Base(int i) {
		print("Base constructor. i = " + i);
	}
	public abstract void f();
}

public class AnonymousConstructor {
	public static Base getBase(int i) {
		return new Base(i) {
			{print("Inside instance initializer");}
			public void f() {
				print("In anonymous f()");
			}
		};
	}
	
	public static void main(String[] args) {
		Base base = getBase(47);
		base.f();
	}
	
}