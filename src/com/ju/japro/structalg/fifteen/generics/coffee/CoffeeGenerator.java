package com.ju.japro.structalg.fifteen.generics.coffee;

import java.util.Iterator;
import java.util.Random;

import com.ju.japro.common.util.Generator;
import com.ju.japro.common.util.Print;

@SuppressWarnings("all")
public class CoffeeGenerator implements Generator<Coffee>,Iterable<Coffee> {
	
	private Class[] types = {Latte.class,Mocha.class,Cappuccino.class,Americano.class,Breve.class};
	private static Random rand = new Random(47);
	public CoffeeGenerator() {}
	private int size = 0;
	public CoffeeGenerator(int sz) {
		this.size = sz;
	}

	public Coffee next() {
		try {
			return (Coffee) types[rand.nextInt(types.length)].newInstance();
		} catch (InstantiationException | IllegalAccessException e) {
			throw new RuntimeException();
		}
	}
	
	class CoffeeIterator implements Iterator<Coffee> {
		int count = size;
		
		public boolean hasNext() {
			return count > 0;
		}
		public Coffee next() {
			count --;
			return CoffeeGenerator.this.next();
		}
		public void remove() {
			throw new UnsupportedOperationException();
		}
	}
	
	public Iterator<Coffee> iterator() {
		return new CoffeeIterator();
	}
	
	public static void main(String[] args) {
		CoffeeGenerator gen = new CoffeeGenerator();
		for (int i = 0; i < 5; i++) {
			Print.print(gen.next());
		}
		for (Coffee c : new CoffeeGenerator(5)) {
			Print.print(c);
		}
	}
	
}