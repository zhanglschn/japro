package com.ju.japro.structalg.fourteen.typeinfo.packageaccess;

import static com.ju.japro.common.util.Print.print;

import com.ju.japro.structalg.fourteen.typeinfo.interfacea.A;

class C implements A {
	public void f() {
		print("public C.f()");
	}

	public void g() {
		print("public C.g()");
	}

	void u() {
		print("package.C.u();");
	}

	protected void v() {
		print("protected C.v()");
	}
}

public class HiddenC {
	public static A makeA() {
		return new C();
	}
}