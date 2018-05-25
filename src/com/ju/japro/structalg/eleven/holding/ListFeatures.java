package com.ju.japro.structalg.eleven.holding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import static com.ju.japro.common.util.Print.print;

public class ListFeatures {
	public static void main(String[] args) {
		Random rand = new Random(47);
		List<Integer> its = getRandList();
		print("1: " + its);
		Integer h = new Integer(46);
		its.add(h);
		
		print("2: " + its);
		
		print("3: " + its.contains(h));
		its.remove(h);
		Integer p = its.get(2);
		print("4: " + p + " " + its.indexOf(p));
		Integer cymric =new Integer(69);
		print("5: " + its.indexOf(cymric));
		print("6: " + its.remove(cymric));
		print("7: " + its.remove(p));
		print("8: " + its);
		its.add(3,new Integer(89));
		List<Integer> sub = its.subList(1,4);
		print("subList: " + sub);
		print("10: " + its.containsAll(sub));
		Collections.sort(sub);
		print("sorted subList: " + sub);
		print("11: " + its.containsAll(sub));
		Collections.shuffle(sub,rand);
		print("12 : " + its.containsAll(sub));
		List<Integer> copy = new ArrayList<Integer>(its);
		sub = Arrays.asList(its.get(1),its.get(4));
		print("sub : " + sub);
		copy.retainAll(sub);
		print("13 :" + copy);
		copy = new ArrayList<Integer>(its);
		copy.remove(2);
		print("14 : " + copy);
		copy.removeAll(sub);
		print("15 : " + copy);
		copy.set(1, new Integer(89));
		print("16: " + copy);
		copy.addAll(2,sub);
		print("17: " + copy);
		print("18: " + its.isEmpty());
		its.clear();
		print("19: " + its);
		print("20: " + its.isEmpty());
		
		Object[] o = its.toArray();
		print("22: " + o[3]);
		Integer[] pa = its.toArray(new Integer[0]);
		print("23 : " + pa[3]);
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