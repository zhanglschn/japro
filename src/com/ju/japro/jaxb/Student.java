package com.ju.japro.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="ROOT")
@XmlAccessorType(XmlAccessType.FIELD)
public class Student {
	private int id;
	private String name;
	private int age;
	private Classroom classroom;
	
	@XmlElement
	private String address = "上海市";

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Classroom getClassroom() {
		return classroom;
	}

	public void setClassroom(Classroom classroom) {
		this.classroom = classroom;
	}

	public Student(int id, String name, int age, Classroom classroom,String address) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.classroom = classroom;
	}

	public Student() {
		super();
	}
}