package com.ju.japro.structalg.seven;

import com.ju.japro.common.util.Print;


class Amphibian{
	private String name;
	Amphibian(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "name  =" + name;
	}
}

public class Frog extends Amphibian{
	private int age;
	Frog(int age,String name) {
		super(name);
		this.age = age;
	}
	@Override
	public String toString() {
		return "age = " + age + "," + super.toString();
	}
	
	public static void main(String[] args) {
		Amphibian ah = new Frog(11, "tony");
		Print.print(ah.toString());
	}
	
}