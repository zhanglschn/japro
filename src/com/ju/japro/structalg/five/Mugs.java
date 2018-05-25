package com.ju.japro.structalg.five;
import static com.ju.japro.common.util.Util.println;

class Mug {
	private int marker = 0;
	Mug(int marker) {
		this.marker = marker;
		println("Mug(" + this.marker + ")");
	}
	void f() {
		println("f(" + this.marker + ")");
	}
}

public class Mugs {
	 Mug mug1;
	 Mug mug2;
	 
	 {
		 mug1 = new Mug(1);
		 mug2 = new Mug(2);
		 println("mug1 & mug2 initialized");
	 }
	 Mugs() {
		 println("Mugs()");
	 }
	 Mugs(int i ) {
		 println("Mugs(int)" + i);
	 }
	 public static void main(String[] args) {
		 println("Inside main()");
		 new Mugs();
		 println("new Mugs() completed");
		 new Mugs(1);
		 println("new Mugs(1) completed");
	 }
	 
}