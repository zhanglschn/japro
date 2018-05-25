package com.ju.japro.structalg.twelve.exceptions;

import com.ju.japro.common.util.Print;

@SuppressWarnings("all")
class OneException extends Exception {
	public OneException(String s){
		super(s);
	}
}

@SuppressWarnings("all")
class TwoException extends Exception {
	public TwoException(String s) {
		super(s);
	}
}

public class RethrowNew {
	public static void f() throws OneException {
		Print.print("originating the exceptioin in f()");
		throw new OneException("thrown from f()");
	}
	public static void main(String[] args) {
		try {
			try {
				f();
			} catch (OneException e) {
				Print.print("Caught in inner try. e.printStackTrace()");
				e.printStackTrace(System.out);
				throw new TwoException("from inner try");
			}
		} catch (TwoException e) {
			Print.print("Caught in outer try,e.printStackTrace()");
			e.printStackTrace(System.out);
		}
	}
}
