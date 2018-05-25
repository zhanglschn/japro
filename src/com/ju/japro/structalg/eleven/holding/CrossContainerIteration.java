package com.ju.japro.structalg.eleven.holding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.TreeSet;

import static com.ju.japro.common.util.Print.printnb;
import static com.ju.japro.common.util.Print.print;

public class CrossContainerIteration {
	public static void display(Iterator<Integer> it){
		while(it.hasNext()) {
			Integer i = it.next();
			printnb("i = " + i + "  ");
		}
		print();
	}
	
	
	public static void main(String[] args) {
		ArrayList<Integer> its1 = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,0,0,9,9,8,7,9));
		LinkedList<Integer> its2 = new LinkedList<Integer>(its1);
		HashSet<Integer> its3 = new HashSet<Integer>(its1);
		TreeSet<Integer> its4 = new TreeSet<Integer>(its1);
		
		display(its1.iterator());
		display(its2.iterator());
		display(its3.iterator());
		display(its4.iterator());
	}
	
}