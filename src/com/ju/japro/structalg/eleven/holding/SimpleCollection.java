package com.ju.japro.structalg.eleven.holding;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import com.ju.japro.common.util.Print;

public class SimpleCollection {
	public static void main(String[] args) {
		
		Set<Integer> hs = new HashSet<Integer>();
		for (int i = 0; i < 10; i++) {
			hs.add(i);
		}
		
		for(int i = 5; i < 15; i++) {
			hs.add(i);
		}
		
		for (Integer is : hs) {
			Print.printnb(is + ",   ");
		}
		
		Print.print();
		Collection<Integer> collection = new ArrayList<Integer>();
		for (int i = 0; i < 10; i ++) {
			collection.add(i);
			
		}
		
		for (Integer i : collection) {
			Print.printnb(i + ",   ");
		}
	}
}