package com.ju.japro.match;

import java.math.BigDecimal;

public class BigDecimalDemo {
	public static void main(String[] args) {

		// create 2 BigDecimal objects
		BigDecimal bg1, bg2;

		// assign value to bg1
		bg1 = new BigDecimal("-40");

		// value before applying abs
		System.out.println("Value is " + bg1);

		// assign absolute value of bg1 to bg2
		bg2 = bg1.abs();

		// print bg2 value
		System.out.println("Absolute value is " + bg2);
	}
}
