package com.ju.japro.proxy;

public class Proxy implements Subject{
	private Subject subject;
	
	public Proxy(Subject subject) {
		this.subject = subject;
	}
	
	public void request() {
		System.out.println("begin");
		subject.request();
		System.out.println("end");
	}	
}