package com.ju.japro.structalg.ten;

import static com.ju.japro.common.util.Print.print;

public class Parcel11 {
	public Destination destination(final String dest,final float price) {
		return new Destination() {
			private int cost;
			{
				cost = Math.round(price);
				if(cost > 100) {
					print("Over budget!");
				}
			}
			private String label = dest;
			public String readLabel() {
				return label;
			}
		};
	}
	
	public static void main(String[] args) {
		Parcel11 p = new Parcel11();
		Destination d = p.destination("Tasmania", 101.395F);
		print(d.readLabel());
	}
}