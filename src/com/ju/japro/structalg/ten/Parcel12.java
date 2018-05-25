package com.ju.japro.structalg.ten;

import static com.ju.japro.common.util.Print.print;

public class Parcel12 {
	private static class ParcelContents implements Contents {
		private int i = 11;
		public int value() {return i;}
	}
	
	protected static class ParcelDestination implements Destination {
		private String label;
		private ParcelDestination (String whereTo){
			this.label = whereTo;
		}
		public String readLabel() {
			return label;
		}
		public static void f() {}
		static int x = 10;
		static class AnotherLevel {
			public static void f() {}
			static int x = 10;
		}
	}
	
	public static Destination destination(String s) {
		return new ParcelDestination(s);
	}
	public static Contents contents() {
		return new ParcelContents();
	}
	
	public static void main(String[] args) {
		Contents c = contents();
		print(c.value());
		Destination d = destination("Tasmania");
		print(d.readLabel());
	}
	
	
	public Contents contents1() {
		class Parcel1Contents  implements Contents {
			private int i = 11;
			public int value() {
				return i;
			}
		}
		return new Parcel1Contents();
	}
	
	public Destination destination1(String label) {
		class Parcel1Destination implements Destination {
			private String label;
			public String readLabel() {
				return label;
			}
			private Parcel1Destination(String label) {
				this.label = label;
			}
		}
		return new Parcel1Destination(label);
	}
	
	
}