package com.ju.japro.structalg.ten;


class Parcel5 {
	private class PContents implements Contents {
		private int i = 11;
		public int value() {
			return i;
		}
	} 
	protected class PDestination implements Destination {
		private String label;
		public String readLabel() {
			return label;
		}
		private PDestination(String whereTo) {
			label = whereTo;
		}
	}
	
	public Destination destination(String s) {
		return new PDestination(s);
	}
	public Contents contents() {
		return new PContents();
	}
}

public class TestParcel {
	public static void main(String[] args) {
		Parcel5 p = new Parcel5();
		Contents c = p.contents();
		Destination d = p.destination("Tasmania");
	}
}