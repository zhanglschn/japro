package com.ju.japro.structalg.five;

//import static com.ju.japro.common.util.Util.print;
import static com.ju.japro.common.util.Util.println;

class Bowl {
	Bowl(int marker) {
		println("Bowl(" + marker + ")");
	}
	void f1(int marker) {
		println("f1(" + marker + ")");
	}
}

class Table {
	static Bowl bowl = new Bowl(1);
	Table() {
		println("Table()");
		bowl2.f1(1);
	}
	void f2(int marker) {
		println("f2(" + marker + ")");
	}
	
	static Bowl bowl2 = new Bowl(2);
}

class Cupboard {
	Bowl bowl3 = new Bowl(3);
	static Bowl bowl4 = new Bowl(4);
	
	static {
		Bowl bowl6 = new Bowl(6);
		Bowl bowl7 = new Bowl(7);
		
		bowl6.f1(23);
		bowl7.f1(23);
	}
	
	Cupboard() {
		println("Cupboard()");
		bowl4.f1(2);
	}
	
	void f3(int marker) {
		println("f3(" + marker + ")");
	}
	static Bowl bowl5 = new Bowl(5);
}

class Bowls {
	static Bowl bowl1;
	static Bowl bowl2;
	static {
		bowl1 = new Bowl(1);
		bowl2 = new Bowl(2);
	}
	Bowls() {
		println("Cups");
	}	
}

public class StaticInittialization {
	public static void main(String[] args) {
		Bowls.bowl1.f1(123);
	}
	static Bowls bowls = new Bowls();
	static Bowls bowls2 = new Bowls();
}