package com.ju.japro.structalg.ten.test;

import com.ju.japro.common.util.Print;
import com.ju.japro.structalg.ten.Contents;

public class Parcal7 {
	public Contents getcontents() {
		return new Contents() {
			private int i = 11;
			public int value() {
				return i;
			}
		};
	}
	
	public static void main(String[] args) {
		Parcal7 parcal7 = new Parcal7();
		Contents cont = parcal7.getcontents();
		Print.print(cont.value());
	}
}