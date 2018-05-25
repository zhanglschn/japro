package com.ju.japro.structalg.ten;

import com.ju.japro.common.util.Print;

public class Parcel9 {
	public Wrapping wrapping(int x) {
		return new Wrapping(x) {
			public int value() {
				return super.value() * 47;
			}
		};
	}
	public static void main(String[] args) {
		Parcel9 p = new Parcel9();
		Wrapping wrapping = p.wrapping(10);
		Print.print(wrapping.value());
	}
}