package com.ju.japro.structalg.two.clone;

public class Inner implements java.io.Serializable{
	private static final long serialVersionUID = 1L;
	
	public String name = "";
	
	public Inner(String name) {
		this.name = name;
	}
	
	public String toString() {
		return "Inner的name值为：" + name;
	}
}