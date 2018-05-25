package com.ju.japro.structalg.ten;

import static com.ju.japro.common.util.Print.print;

public interface ClassInInterface {
	void howdy();
	class Test implements ClassInInterface {
		public void howdy() {
			print("Howdy!");
		}
		public static void main(String[] args) {
			new Test().howdy();
		}
	}
}