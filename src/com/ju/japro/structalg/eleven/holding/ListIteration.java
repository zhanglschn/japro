package com.ju.japro.structalg.eleven.holding;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;

import static com.ju.japro.common.util.Print.print;
import static com.ju.japro.common.util.Print.printnb;

public class ListIteration {
	public static void main(String[] args) {
		List<Integer> its = new ArrayList<Integer>();
		its.add(12);
		its.add(22);
		its.add(32);
		its.add(42);
		its.add(52);
		its.add(62);
		
		ListIterator<Integer> it = its.listIterator();
		while(it.hasNext()) {
			printnb(it.next() + ",  " + it.nextIndex() + ",  " + it.previousIndex() + ";");
		}
		print();
		while(it.hasPrevious()) {
			printnb(it.previous()  + "   ");
		}
		print();
		print(its);
		it = its.listIterator(0);
		
		while(it.hasNext()) {
			it.next();
			it.set(getRandInt(2,10));
		}
		print(its);
	}
	
	private static Integer getRandInt(int min,int max) {
		Random random = new Random();

		int s = random.nextInt(max) % (max - min + 1) + min;
		return s;
	}
}