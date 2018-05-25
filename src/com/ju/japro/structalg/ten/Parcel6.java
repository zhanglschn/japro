package com.ju.japro.structalg.ten;

public class Parcel6 {
	public Destination destination(String s ) {
		class PDestination implements Destination {
			private String label;
			private PDestination(String whereTo) {
				label = whereTo;
			}
			public String readLabel() {
				return label;
			}
		}
		return new PDestination(s);
	}
	
	public static void main(String[] args) {
		Parcel6 p = new Parcel6();
		Destination d = p.destination("Tasmania");
	}
}