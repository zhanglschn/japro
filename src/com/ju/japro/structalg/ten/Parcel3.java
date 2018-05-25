package com.ju.japro.structalg.ten;

import com.ju.japro.common.util.Print;

public class Parcel3 {
	class Outer {
		private String name;

		public Outer(String name) {
			this.name = name;
		}

		public String getName() {
			return this.name;
		}

		class Inner {
			private int age;

			public Inner(int age) {
				this.age = age;
			}

			public int getAge() {
				return age;
			}
		}

		public Inner getInner(int age) {
			return new Inner(age);
		}
	}

	public Outer getOuter(String name) {
		return new Outer(name);
	}
	
	public static void main(String[] args) {
		Parcel3 p = new Parcel3();
		Outer outer = p.getOuter("name");
		Print.print(outer.getName());
	}
}
