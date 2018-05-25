package com.ju.japro.structalg.ten.test;

import com.ju.japro.common.util.Print;

public interface Parcal10 {
	void show();
	class Parcal101 implements Parcal10 {
		public void show() {
			Print.print("Test Parcal10 show()");
		}
		public static void showAlso(Parcal101 parc) {
			parc.show();
		}
		public static void main(String[] args) {
			Parcal101.showAlso(new Parcal101());
		}
	} 
}