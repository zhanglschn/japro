package com.ju.japro.structalg.two;

import java.util.Random;
import static com.ju.japro.structalg.two.util.Util.println;

public class BitManipulation {
	public static void main(String[] args) {
		Random rand = new Random(47);
		int i = rand.nextInt();
		int j = rand.nextInt();

		printBinaryInt("-1", -1);
		printBinaryInt("+1", +1);

		int maxpos = 2147483647;
		printBinaryInt("maxpos", maxpos);
		int maxneg = -2147483648;
		printBinaryInt("maxneg", maxneg);

		printBinaryInt("i", i);
		printBinaryInt("~i", ~i);
		printBinaryInt("-i", -i);

		printBinaryInt("j", j);
		printBinaryInt("i & j", i & j);
	}

	static void printBinaryInt(String s, int i) {
		println(s + ", int:  " + i + ", binary:\n\t"
				+ Integer.toBinaryString(i));
	}

	static void printBinaryLong(String s, long l) {
		println(s + ", long :  " + l + ", binary:\n\t" + Long.toBinaryString(l));
	}
}