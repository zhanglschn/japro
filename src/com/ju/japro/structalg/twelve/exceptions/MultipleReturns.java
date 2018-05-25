package com.ju.japro.structalg.twelve.exceptions;

import static com.ju.japro.common.util.Print.print;

public class MultipleReturns {
	public static int f(int i) {
		print("Initialization that requires cleanup");

		try {
//			print("Point 1");
			if (i == 1)
				return i;
//			print("Point 2");
			if (i == 2)
				return i;
//			print("Point 3");
			if (i == 3)
				return i;
//			print("end");
			return   60;
		} finally {
		}
	}
	
	public static void main(String[] args) {
//		for (int i = 1; i <= 4; i++) {
			int i = f(3);
			System.out.println(i);
//		}
	}
	
}