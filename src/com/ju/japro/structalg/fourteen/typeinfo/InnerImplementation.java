package com.ju.japro.structalg.fourteen.typeinfo;

import static com.ju.japro.common.util.Print.print;

import com.ju.japro.structalg.fourteen.typeinfo.interfacea.A;
@SuppressWarnings("all")
class InnerA {
	private static class C implements A {
		public void f() {
			print("public C.f()");
		}
		public void g() {
			print("public C.g()");
		}
		void u() {
			print("package C.u()");
		}
		protected void v() {
			print("protected C.v()");
		}
		private void w() {
			print("private C.w()");
		}
	}
	public static A makeA() {
		return new C();
	}
}

public class InnerImplementation {
	public static void main(String[] args) throws Exception {
		A a = InnerA.makeA();
		a.f();
		
		print(a.getClass().getName());
		HiddenImplementation.callHidenMethod(a, "g");
		HiddenImplementation.callHidenMethod(a, "u");
		HiddenImplementation.callHidenMethod(a, "v");
		HiddenImplementation.callHidenMethod(a, "w");
	}
}