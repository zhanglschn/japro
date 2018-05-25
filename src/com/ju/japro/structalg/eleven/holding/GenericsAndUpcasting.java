package com.ju.japro.structalg.eleven.holding;

import java.util.ArrayList;

import com.ju.japro.common.util.Print;

class GrannySmith extends Apple {}
class Gala extends Apple{}
class Fuji extends Apple{}
class Braeburn extends Apple{}

public class GenericsAndUpcasting {
	public static void main(String[] args) {
		ArrayList<Apple> apples = new ArrayList<Apple>();
		
		apples.add(new GrannySmith());
		apples.add(new Gala());
		apples.add(new Fuji());
		apples.add(new Braeburn());
		for (Apple apple : apples) {
			Print.print(apple);
		}
	}
}