package com.ju.japro.structalg.five;
import static com.ju.japro.common.util.Util.print;
import static com.ju.japro.common.util.Util.println;

public class OverloadingVarargs {
	static void f(Character...args) {
		print("first");
		for(Character c : args) {
			print("    " + c);
		}
		println();
	}
	static void f(Integer... args) {
		print("second");
		for(Integer c : args) {
			print("    " + c);
		}
		println();
	}
	
	static void f(Long... args) {
		print("third");
		for(Long c : args) {
			print("    " + c);
		}
		println();
	}
	
	public static void main(String[] args) {
		f('a','b','c');
		f(1);
		f(2,1);
		f(0);
		f(0L);
//		f();
	}
}