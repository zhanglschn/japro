package com.ju.japro.structalg.ten;

import com.ju.japro.common.util.Print;

public class Parcel8b {
	class MyContents implements Contents {
		private int i = 11;
		public int value() {
			return i;
		}
	}
	public Contents contents() {
		return new MyContents();
	}
	
	public static void main(String[] args) {
		Parcel8b pcb = new Parcel8b();
		Contents content = pcb.contents();
		Print.print(content.value());
	}
}