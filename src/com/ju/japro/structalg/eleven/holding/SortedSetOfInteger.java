package com.ju.japro.structalg.eleven.holding;

import java.util.Random;
import java.util.SortedSet;
import java.util.TreeSet;

import com.ju.japro.common.util.Print;

public class SortedSetOfInteger {
	public static void main(String[] args) {
		Random rand = new Random(47);
		SortedSet<Integer> intset = new TreeSet<Integer>();
		for (int i = 0; i < 10000; i++) {
			intset.add(rand.nextInt(30));
		}
		Print.print(intset);
	}
}