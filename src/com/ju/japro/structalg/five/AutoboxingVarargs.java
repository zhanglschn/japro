package com.ju.japro.structalg.five;
import static com.ju.japro.common.util.Util.print;
import static com.ju.japro.common.util.Util.println;

public class AutoboxingVarargs {
	public static void f(Integer... args) {
		for (Integer i : args) {
			print(i + "   ");
		}
		println();
	}
	
	public static void f1(long... args) {
		for (long i : args) {
			print(i + "   ");
		}
		println();
	}
	
	public static void main(String[] args) {
		/**
		f(new Integer(1),new Integer(2));
		f(4,5,6,7,8,9);
		f(10,new Integer(11),12);
		**/
		f1(1,2,3,4);
		
	}
}