package com.ju.japro.structalg.interfaces.nesting;

import static com.ju.japro.common.util.Print.print;

interface Service {
	void method1();
	void method2();
}

interface ServiceFactory {
	Service getService();
}

class Implementation1 implements Service {
	public Implementation1() {
	}
	public void method1() {
		print("Implementation1 method1");
	}
	public void method2() {
		print("Implementation1 method2");
	}
}
class Implementation2 implements Service {
	public Implementation2() {
	}
	public void method1() {
		print("Implementation2 method1");
	}
	public void method2() {
		print("Implementation2 method2");
	}
}

class Implementation1Factory implements ServiceFactory {
	public Service getService() {
		return new Implementation1();
	}
}


class Implementation2Factory implements ServiceFactory {
	public Service getService() {
		return new Implementation2();
	}
}

public class Factories {
	public static void ServiceConsumer(ServiceFactory fact) {
		Service s = fact.getService();
		s.method1();
		s.method2();
	}
	
	public static void main(String[] args) {
		ServiceConsumer(new Implementation1Factory());
		ServiceConsumer(new Implementation2Factory());
	}
}