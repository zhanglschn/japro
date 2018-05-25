package com.ju.japro.structalg.five;

import static com.ju.japro.common.util.Util.println;
import static com.ju.japro.common.util.Util.print;

public class VarargType {
	static void f(Character... args) {
		print(args.getClass() + "   ");
		println("length " + args.length );
	}
	static void g(int... args) {
		print(args.getClass() + "   ");
		println("length " + args.length);
	}
	
	public static void main(String[] args) {
		f('a');
		f();
		g(1);
		g();
		println("int[]: " + new int[0].getClass());
	}
}