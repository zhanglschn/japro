package com.ju.japro.structalg.ten;
import static com.ju.japro.common.util.Print.printnb;
interface Selector1 {
	boolean end();
	Object current();
	void next();
}


public class Sequence1 {
	private Object[] items;
	private int next = 0;
	
	public Sequence1(int size) {
		items = new Object[size];
	}
	
	public void add(Object obj) {
		if (next < items.length) {
			items[next ++] = obj;
		}
	}
	
	private class Sequence1Selector implements Selector1{
		private int i = 0;
		public boolean end() {
			return i == items.length;
		}
		public Object current() {
			return items[i];
		}
		public void next() {
			i++;
		}
	}
	
	public Selector1 getSelector() {
		return new Sequence1Selector();
	}
	
	public static void main(String[] args) {
		Sequence1 sequence1 = new Sequence1(100);
		for (int i = 0; i < 100; i++) {
			sequence1.add(Integer.toString(i));
		}
		
		Selector1 selector1 = sequence1.getSelector();
		
		while (!selector1.end()) {
			printnb(selector1.current() + ",");
			selector1.next();
		}
		
	}
}