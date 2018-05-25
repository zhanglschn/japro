package com.ju.japro.structalg.fifteen.generics;

import com.ju.japro.common.util.Print;

public class Holder2 {
	private Object a;

	public Holder2(Object a) {
		this.a = a;
	}

	public void set(Object a) {
		this.a = a;
	}

	public Object get() {
		return a;
	}

	public static void main(String[] args) {
		Holder2 h2 = new Holder2(new Automobile());
		Automobile a = (Automobile) h2.get();
		Print.print(a);
		h2.set("Not an Automobile");
		String s = (String) h2.get();
		h2.set(1);
		Print.print(s);
		Integer x = (Integer) h2.get();
		
		Print.print(x);
	}
}