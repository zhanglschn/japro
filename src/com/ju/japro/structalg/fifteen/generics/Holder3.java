package com.ju.japro.structalg.fifteen.generics;

import com.ju.japro.common.util.Print;

public class Holder3<T> {
	private T a;
	public Holder3(T a) {
		this.a = a;
	}
	public void set(T a) {
		this.a = a;
	}
	public T get(){
		return a;
	}
	public static void main(String[] args) {
		Holder3<Automobile> h3 = new Holder3<Automobile>(new Automobile());
		Automobile a = h3.get();
		Print.print(a.toString());
	}
}