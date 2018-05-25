package com.ju.japro.structalg.fourteen.typeinfo;

import static com.ju.japro.common.util.Print.print;

import java.lang.reflect.Field;

class WithPrivateFinalField{
	private int i = 1;
	private final String s = "I'm totally safe";
	private String s2 = "Am I safe?";
	public String toString() {
		return "i = " + i + " , " + s + " , " + s2;
	}
}

public class ModifyingPrivateFields {
	public static void main(String[] args) throws Exception {
		WithPrivateFinalField pf = new WithPrivateFinalField();
		print(pf);
		
		Field f = pf.getClass().getDeclaredField("i");
		f.setAccessible(true);
		f.set(pf, 47);
		print(pf);
		
		f = pf.getClass().getDeclaredField("s");
		f.setAccessible(true);
		f.set(pf, "No,You're not!");
		print(pf);
		
		
		f = pf.getClass().getDeclaredField("s2");
		f.setAccessible(true);
		f.set(pf, "No,You're not!");
		print(pf);
	}
}