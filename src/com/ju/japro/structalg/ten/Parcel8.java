package com.ju.japro.structalg.ten;

import com.ju.japro.common.util.Print;

public class Parcel8 {
	public Contents contents() {
		return new Contents() {
			private int i = 11;
			public int value() {
				return i;
			}
		};
	}
	public static void main(String[] args) {
		Parcel8 pc = new Parcel8();
		Contents c = pc.contents();
		Print.print(c.value());
	}
}