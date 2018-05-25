package com.ju.japro.structalg.eleven.holding;

import java.util.ArrayList;

import static com.ju.japro.common.util.Print.print;

public class ApplesAndOrangesWithGenerics {
	public static void main(String[] args) {
		ArrayList<Apple> apples = new ArrayList<Apple>();
		for (int i = 0; i < 3; i++) {
			apples.add(new Apple());
		}
		
		for(int i = 0; i < apples.size();i++) {
			print(apples.get(i).id());
		}
		for (Apple c : apples) {
			print(c.id());
		}
	}
}