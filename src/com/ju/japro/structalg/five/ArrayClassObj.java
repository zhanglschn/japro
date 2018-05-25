package com.ju.japro.structalg.five;

import java.util.Arrays;
import java.util.Random;

import static com.ju.japro.common.util.Util.println;

public class ArrayClassObj {
	public static void main(String[] args) {
		Random rand = new Random(47);
		Integer[] a = new Integer[rand.nextInt(20)];
		println("length of a = " + a.length);
		///55, 193, 361, 461, 429, 368, 200, 22
		for (int i = 0; i < a.length; i++) {
			a[i] = rand.nextInt(500);
		}
		println(Arrays.toString(a));
	}
}