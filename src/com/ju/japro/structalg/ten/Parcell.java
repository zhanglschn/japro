package com.ju.japro.structalg.ten;
import static com.ju.japro.common.util.Print.print;

public class Parcell {
	class Contents {
		private int i = 11;
		public int value() {return i;}
	}
	class Destination {
		private String label;
		Destination(String whereTo) {
			label = whereTo;
		}
		String readLabel() {return label;}
	}
	public void ship(String dest) {
		Contents c = new Contents();
		Destination d = new Destination(dest);
		print(d.readLabel());
		print(c.value());
	}
	public static void main(String[] args) {
		Parcell p = new Parcell();
		p.ship("Tasmania");
	}
}