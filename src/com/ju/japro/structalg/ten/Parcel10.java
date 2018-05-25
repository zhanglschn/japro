package com.ju.japro.structalg.ten;

import com.ju.japro.common.util.Print;

public class Parcel10 {
	public Destination destination(final String dest) {
		return new Destination() {
			private String label = dest;
			public String readLabel() {
				return label;
			}
		};
	}
	public static void main(String[] args) {
		Parcel10 parcel10 = new Parcel10();
		Destination d = parcel10.destination("Tasmal");
		Print.print(d.readLabel());
	}
}