package com.ju.japro.structalg.eleven.holding;

import java.util.AbstractCollection;
import java.util.Iterator;

public class CollectionSequence extends AbstractCollection<Integer>{
	private Integer[] its = new Integer[]{1,2,3,4,5,6,7,8,9,10};
	
	public Iterator<Integer> iterator() {
		return new Iterator<Integer>() {
			private int index = 0;
			public boolean  hasNext() {
				return index < its.length;
			}
			public Integer next() {
				return its[index++];
			}
			public void remove() {
				throw new UnsupportedOperationException();
			}
		};
	}
	
	public int size() {
		return its.length;
	}
	
	public static void main(String[] args) {
		CollectionSequence c = new CollectionSequence();
	}
}