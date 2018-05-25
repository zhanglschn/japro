package com.ju.japro.structalg.eleven.holding;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

import static com.ju.japro.common.util.Print.printnb;
import static com.ju.japro.common.util.Print.print;

public class SimpleIteration {
	public static void main(String[] args) {
		List<Integer> its = getRandList();
		Iterator<Integer> it= its.iterator();
		while (it.hasNext()) {
			Integer i = it.next();
			printnb("i = "  + i + "   ");
		}
		
		print();
		
		for (Integer i : its) {
			printnb("i = " + i + "  ");
		}
		
		it = its.iterator();
		for (int i = 0 ; i < 6; i++) {
			it.next();
			it.remove();
		}
		print();
		print(its);
	}
	
	public static List<Integer> getRandList() {
		List<Integer> its = new ArrayList<Integer>();
		for (int i = 0; i < 15; i++) {
			its.add(getRandInt(i,500));
		}
		return its;
		
	}

	private static Integer getRandInt(int min,int max) {
		Random random = new Random();

		int s = random.nextInt(max) % (max - min + 1) + min;
		return s;
	}
}