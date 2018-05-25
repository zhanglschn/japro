package com.ju.japro.structalg.ten;

import static com.ju.japro.common.util.Print.print;

public class TestBed {
	public void f(){
		print("f()");
	}
	public static class Tester {
		public static void main(String[] args) {
			TestBed t = new TestBed();
			t.f();
		}
	}
}