package com.ju.japro.proxy;

public class RealSubject implements Subject{

	public void request() {
		System.out.println("RealSubject");
	}
}