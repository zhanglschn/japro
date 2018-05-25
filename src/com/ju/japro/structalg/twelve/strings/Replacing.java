package com.ju.japro.structalg.twelve.strings;

import static com.ju.japro.common.util.Print.print;



public class Replacing {
	static String s = Splitting.knights;
	public static void main(String[] args) {
//		print(s.replaceAll("f\\w+", "located"));
//		print(s.replaceFirst("^[A-Z].*[\\.]$", "This is a Replace str"));
		print(s.replaceFirst("^[A-Z].*[\\.]$", "This is a Replace str"));
		
		print(s.replaceFirst(".*[\\.]$", "s"));
//		print(s.replaceAll("shrubbery|tree|herring", "banana"));
	}
}