package com.ju.japro.structalg.two;

import static com.ju.japro.structalg.two.util.Util.print;
import static com.ju.japro.structalg.two.util.Util.println;

public class Person {
	private String lastName;
	private String firstName;
	private int age;

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Person(String lastName, String firstName, int age) {
		super();
		this.lastName = lastName;
		this.firstName = firstName;
		this.age = age;
	}

	public void displayPerson() {
		print("   Last name : " + lastName);
		print(", First name : " + firstName);
		println(", Age : " + age);
	}
}