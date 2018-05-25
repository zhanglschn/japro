package com.ju.japro.structalg.twelve.exceptions;

import static com.ju.japro.common.util.Print.print;


public class Rethrowing {
	public static void f() throws Exception {
		print("originating the exception in f()");
		throw new Exception("thrown from f()");
	}
	
	public static void g() throws Exception {
		try {
			f();
		} catch (Exception e) {
			print("Inside g().e.printStackTrace()");
			e.printStackTrace(System.out);
			throw e;
		}
	}
	
	public static void h() throws Exception {
		try {
			f();
		} catch (Exception e) {
			print("Inside h().e.printStackTrace()");
			e.printStackTrace(System.out);
			throw (Exception)e.fillInStackTrace();
		}
	}
	
	public static void main(String[] args) {
		try {
			g();
		} catch (Exception e) {
			print("main : printStackTrace()");
			e.printStackTrace(System.out);
		}
		System.out.println("\n\n\n\n\n");
		try {
			h();
		} catch (Exception e) {
			print("Main: printStackTrace()");
			e.printStackTrace(System.out);
		}
	}
	
}