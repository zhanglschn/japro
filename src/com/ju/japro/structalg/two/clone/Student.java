package com.ju.japro.structalg.two.clone;

public class Student implements Cloneable {
	private int number;
	private Address addr;

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	@Override
	public Object clone() {
		Student stu = null;
		try {
			stu = (Student) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		stu.addr = (Address) addr.clone();//深度复制
		return stu;
	}

	public Address getAddr() {
		return addr;
	}

	public void setAddr(Address addr) {
		this.addr = addr;
	}
}