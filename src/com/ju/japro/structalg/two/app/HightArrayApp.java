package com.ju.japro.structalg.two.app;

import com.ju.japro.structalg.two.HightArray;

public class HightArrayApp {
	public static void main(String[] args) {
		int maxSize = 100;				// array size
		
		HightArray arr;					// reference to array
		arr = new HightArray(maxSize);	// create the array
		
		initArrayData(arr);				// initialzation data to array
		arr.display();					// display item
		int searchKey = 53;				// search for item
		if (arr.find(searchKey)) 
			pl("Found " + searchKey);
		else
			pl("Can't find " + searchKey);
		arr.delete(00);
		arr.delete(12);
		arr.delete(18);
		arr.display();
		
	}
	
	private static void pl(Object obj) {
		System.out.println(obj);
	}
	
	/**
	 * initialzation data to HightArray.array
	 * @param arr HightArray.array
	 */
	private static void initArrayData(HightArray arr) {
		arr.insert(77);					// insert 18 items
		arr.insert(99);
		arr.insert(44);
		arr.insert(55);
		arr.insert(66);
		arr.insert(88);
		arr.insert(11);
		arr.insert(22);
		arr.insert(33);
		arr.insert(00);
		arr.insert(16);
		arr.insert(12);
		arr.insert(13);
		arr.insert(14);
		arr.insert(15);
		arr.insert(16);
		arr.insert(17);
		arr.insert(18);
	}
}