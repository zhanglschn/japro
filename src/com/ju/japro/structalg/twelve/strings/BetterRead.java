package com.ju.japro.structalg.twelve.strings;

import java.util.Scanner;
import static com.ju.japro.common.util.Print.print;
import static com.ju.japro.common.util.Print.format;

public class BetterRead {
	public static void main(String[] args) {
		Scanner stdin = new Scanner(SimpleRead.input);
		
		print("What is your name?");
		String name = stdin.nextLine();
		print(name);
		print("How old are you? what is your favorite double?");
		print("(input: <age>) <double>");
		int age = stdin.nextInt();
		
		double favorite = stdin.nextDouble();
		print(age);
		print(favorite);
		format("Hi %s.\n", name);
		format("In S years you will be %d.\n", age +1);
		format("My favorite double is %f.", favorite / 2);
		stdin.close();
	}
}