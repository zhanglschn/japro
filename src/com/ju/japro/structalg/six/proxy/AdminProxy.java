package com.ju.japro.structalg.six.proxy;

import static com.ju.japro.common.util.Print.print;

public class AdminProxy implements Manager{
	private Admin admin;
	
	public AdminProxy(Admin admin) {
		super();
		this.admin = admin;
	}
	
	public void doSomething() {
		print("Log:admin dosomething begin");
		admin.doSomething();
		print("Log:admin dosomething end");
	}
	
	public static void main(String[] args) {
//		Admin admin = new Admin();
//		Manager m = new AdminProxy(admin);
//		m.doSomething();
		
		AdminPoly proxy = new AdminPoly();
		proxy.doSomething();
	}
	
}