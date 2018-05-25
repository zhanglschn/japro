package com.ju.japro.structalg.ten.test;

import com.ju.japro.common.util.Print;

public interface Parcal8 {
	void show();
	class Parcal9 implements Parcal8 {
		public void show() {
			Print.print("show()");
		}
		public static void main(String[] args) {
			new Parcal9().show();
		}
	}
}