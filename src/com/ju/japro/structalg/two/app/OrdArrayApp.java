package com.ju.japro.structalg.two.app;

import com.ju.japro.structalg.two.OrdArray;
import static com.ju.japro.structalg.two.util.Util.println;

public class OrdArrayApp {
	public static void main(String[] arguments) {
		int maxSize = 10000;
		OrdArray ordArray;
		ordArray = new OrdArray(maxSize);
		
//		ordArray.insert(77);
//		ordArray.insert(99);
//		ordArray.insert(44);
//		ordArray.insert(55);
//		ordArray.insert(22);
//		ordArray.insert(88);
//		ordArray.insert(11);
//		ordArray.insert(00);
//		ordArray.insert(66);
//		ordArray.insert(11);
//		ordArray.insert(12);
//		ordArray.insert(13);
//		ordArray.insert(14);
//		ordArray.insert(21);
//		ordArray.insert(22);
//		ordArray.insert(23);
//		ordArray.insert(24);
//		ordArray.insert(31);
//		ordArray.insert(32);
//		ordArray.insert(33);
//		ordArray.insert(34);
//		ordArray.insert(35);
//		ordArray.insert(41);
//		ordArray.insert(42);
//		ordArray.insert(43);
//		ordArray.insert(44);
//		ordArray.insert(51);
//		ordArray.insert(52);
//		ordArray.insert(61);
		
		for (int i = 0; i < 1000; i++) {
			ordArray.insert(i);
		}
		
		int searchKey = 55;
		if (ordArray.find(searchKey) != ordArray.size()) {
			println("Found : " + searchKey);
		} else {
			println("Can't find " + searchKey);
		}
		
		ordArray.display();
		
		ordArray.delete(00);
		ordArray.delete(55);
		ordArray.delete(99);
		
		ordArray.display();
	}
}