package com.ju.japro.proxy;

public class ProxyTest {
	public static void main(String[] args) {
		RealSubject subject = new RealSubject();
		Proxy proxy = new Proxy(subject);
		proxy.request();
	}
}