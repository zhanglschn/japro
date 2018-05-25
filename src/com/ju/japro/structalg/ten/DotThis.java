package com.ju.japro.structalg.ten;

import static com.ju.japro.common.util.Print.print;

public class DotThis {
	void f(){print("DotThis.f()");};
	public class Inner {
		public DotThis outer() {
			return DotThis.this;
		}
	}
	public Inner inner() {return new Inner();}
	public static void main1(String[] args) {
		DotThis dt = new DotThis();
		DotThis.Inner dti = dt.inner();
		dti.outer().f();
	}
	
	
	public class Outer {
		public DotThis getThis (){
			return DotThis.this;
		}
	}
	
	public Outer getOuter() {return new Outer();}
	
	public static void main(String[] args) {
		DotThis dt= new DotThis();
		DotThis.Outer outer = dt.getOuter();
		outer.getThis().f();
	}
}