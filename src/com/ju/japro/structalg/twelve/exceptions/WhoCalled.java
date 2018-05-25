package com.ju.japro.structalg.twelve.exceptions;

import static com.ju.japro.common.util.Print.print;
import static com.ju.japro.common.util.Print.printnb;

public class WhoCalled {
	static void f() {
		try {
			throw new Exception();
		} catch (Exception e) {
			for (StackTraceElement ste : e.getStackTrace()) {
				printnb(ste.getMethodName() 
						+ "--" + ste.getClassName() 
						+ "--" + ste.getLineNumber());
				print();
			}
		}
	}
	
	static void g() {f();}
	static void h() {g();}
	public static void main(String[] args) {
		f();
		print("---------------------------------");
		g();
		print("---------------------------------");
		h();
	}
	
}