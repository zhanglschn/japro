package com.ju.japro.structalg.two;

//import static com.ju.japro.structalg.two.util.Util.print;
import static com.ju.japro.structalg.two.util.Util.println;

public class URShift {
	public static void main(String[] args) {
		int i = -1;
		println("int before: " + Integer.toBinaryString(i));
		i >>>=10;
		
		println("int after: " + Integer.toBinaryString(i));
		long l = -1;
		println("long before: " + Long.toBinaryString(l));
		
		l >>>= 10;
		
		println("long after: " + Long.toBinaryString(l));
		
		short s = -1;
		
		println("short before: " + Integer.toBinaryString(s));
		s >>>=10;
		println("short after: " + Integer.toBinaryString(s));
		
		byte b = -1;
		println("byte before: " + Integer.toBinaryString(b));
		
		b >>>= 10;
		println("byte after: " + Integer.toBinaryString(b));
		
		b = -1;
		println("byte before1: " + Integer.toBinaryString(b));
		println("byte after2: " + Integer.toBinaryString(b>>>10));
	}
}