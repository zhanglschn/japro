package com.ju.japro.structalg.five;

import static com.ju.japro.common.util.Util.println;
import static com.ju.japro.common.util.Util.print;

public class OptionalTrailingArguments {
	static void f(int required,String...trailing) {
		print("required: " + required + "   ");
		for (String str : trailing) {
			print(str + "   ");
		}
		println();
	}
	
	public static void main(String[] args) {
		f(1,"one");
		f(2, "two","three");
		f(0);
	}
}