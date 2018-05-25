package com.ju.japro.structalg.two.app;

import java.util.Random;

import com.ju.japro.structalg.two.LowArray;

public class LowArrayApp {
	public static void main(String[] arguments) {
		LowArray arr; // reference
		arr = new LowArray(100);
		int nElems = 0;
		int j;

		for (int i = 0; i < 100; i++) {
			arr.setElement(i, getRandom());
		}

		nElems = 20;
		for (j = 0; j < nElems; j++) {
			p(arr.getElement(j) + "\t");
		}
		pl("");

		long searchKey = arr.getElement(0);
		arr.searchElement(searchKey);
		nElems = arr.delElement(searchKey, nElems);
		
		for (j = 0; j < nElems; j++) {
			p(arr.getElement(j) + "\t");
		}
	}

	private static void p(Object obj) {
		System.out.print(obj);
	}

	private static void pl(Object obj) {
		System.out.println(obj);
	}

	public static int getRandom() {
		Random rand = new Random();
		int result = rand.nextInt(100);
		return result;
	}
}