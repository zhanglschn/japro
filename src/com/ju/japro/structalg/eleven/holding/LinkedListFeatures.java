package com.ju.japro.structalg.eleven.holding;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import static com.ju.japro.common.util.Print.print;

public class LinkedListFeatures {
	public static void main(String[] args) {
		LinkedList<Integer> its = new LinkedList<Integer>(getRandList());
		print(its);
		print("its.getFirst(): " + its.getFirst());
		print("its.element(): " + its.element());
		print("its.peek(): " + its.peek());
		print("its.remove(): " + its.remove());
		print("its.removeFirst(): " + its.removeFirst());
		print("its.poll(): " + its.poll());
		print(its);
		its.addFirst(new Integer(123));
		print("After addFirst(): " + its);
		
		its.addLast(new Integer(23));
		print("After addLast() : " + its);
		print("its.removeLast() : " + its.removeLast());
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