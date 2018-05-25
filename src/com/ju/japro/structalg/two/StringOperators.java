package com.ju.japro.structalg.two;
import static com.ju.japro.structalg.two.util.Util.println;

public class StringOperators {
	public static void main(String[] args) {
		int x = 0,y = 1,z = 2;
		String s = "x,y,z";
		println(s + x + y + z);
		println(x + " " + s);
		boolean a1 = false;
		boolean a2 = true;
		while (a1 == a2) {
			System.out.println(1);
		}
	}
}