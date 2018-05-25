package com.ju.japro.structalg.ten;

import com.ju.japro.common.util.Print;

public class Parcel4 {
	class Contents {
		private int i = 11;
		public int value() {return i;}
	}
	class Destination {
		private String label;
		Destination(String whereTo) {
			label = whereTo;
		}
		String readLabel(){return label;}
	}
	
	class Description {
		private String content;
		Description(String content) {
			this.content = content;
		}
		String getContent() {
			return content;
		}
	}
	
	public static void main(String[] args) {
		Parcel4 p = new Parcel4();
		Parcel4.Contents c = p.new Contents();
		Parcel4.Destination d = p.new Destination("Tasmania");
		Parcel4.Description des = p.new Description("content");
		
		Print.print(des.getContent());
		Print.print(d.readLabel());
		Print.print(c.value());
	}
}