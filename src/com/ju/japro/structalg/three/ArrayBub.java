package com.ju.japro.structalg.three;

import static com.ju.japro.structalg.two.util.Util.println;
import static com.ju.japro.structalg.two.util.Util.print;

public class ArrayBub {
	private long[] a;				// ref to array a
	private int size;				// number of data items
	
	public ArrayBub(int max) {		// constructor
		a = new long[max];			// create the 
		size = 0;
	}
	
	//-----------------------------------------------------
	public void insert(long value) {
		a[size] = value;
		size ++;
	}
	//-----------------------------------------------------
	public void display() {
		for (int j = 0; j < size; j++)
			print(a[j] + "    ");
		println("");
	}
	
	//-----------------------------------------------------
	public void bubbleSort() {
		int out,in;
		for (out = size -1; out >1; out--) 
			for (in = 0; in < out; in++) 
				if (a[in] > a[in + 1])
					swap(in,in+1);
		
	}
	
	private void swap(int one,int two) {
		long temp = a[one];
		a[one] = a[two];
		a[two] = temp;
	}
}