package com.ju.japro.structalg.twelve.strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;

import static com.ju.japro.common.util.Print.print;
import static com.ju.japro.common.util.Print.format;

public class SimpleRead {
	public static BufferedReader input = new BufferedReader(new StringReader("Sir Robin of Camelot\n22 1.61803"));
	
	public static void main(String[] args) {
		try {
			print("What is your name? ");
			String name = input.readLine();
			
			print(name);
			print("How old are you? What is your favorite double?");
			print("(input: <age> <double>)");
			String numbers = input.readLine();
			print(numbers);
			
			String[] numArray = numbers.split(" ");
			int age = Integer.parseInt(numArray[0]);
			double favorite = Double.parseDouble(numArray[1]);
			format("Hi %s.\n", name);
			format("In S years you will be %d.\n", age +1);
			format("My favorite double is %f.", favorite / 2);
		} catch (IOException e) {
			System.err.println("I/O exception");
		}
	}
}