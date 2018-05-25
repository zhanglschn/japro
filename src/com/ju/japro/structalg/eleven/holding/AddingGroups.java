package com.ju.japro.structalg.eleven.holding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import com.ju.japro.common.util.Print;

public class AddingGroups {
	public static void main(String[] args) {
		Collection<Integer> collection = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,7));
		Integer[] moreInts = {6,7,8,9,10};
		collection.addAll(Arrays.asList(moreInts));
		Collections.addAll(collection, 11,12,13,14,15);
		Collections.addAll(collection,moreInts);
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(16,17,18,19,20));
		list.set(1,99);
		list.add(123);
		for (Integer i : collection) {
			Print.printnb(i + ",   ");
		}
		Print.print("\n");
		for (Integer i : list) {
			Print.printnb(i + ",   ");
		}
	}
}