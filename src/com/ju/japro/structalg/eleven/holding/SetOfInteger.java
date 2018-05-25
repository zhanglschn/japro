package com.ju.japro.structalg.eleven.holding;

import java.awt.Insets;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

import static com.ju.japro.common.util.Print.print;

public class SetOfInteger {
	public static void main(String[] args) {
		/**
		Random rand = new Random(47);
		Set<Integer> intset = new HashSet<Integer>();
		for (int i = 0; i < 10000; i++) 
			intset.add(rand.nextInt(30));
		Print.print(intset);
		**/
		Random rand = new Random(47);
		SortedSet<Integer> intset = new TreeSet<Integer>();
		for (int i = 0; i < 10000;i++) {
			intset.add(rand.nextInt(30));
		}
		print(intset);
	}
}