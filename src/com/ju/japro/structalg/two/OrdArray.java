package com.ju.japro.structalg.two;
import static com.ju.japro.structalg.two.util.Util.println;
// orderedArray.java
// demonstrates ordered array class
// to run this program: java OrdArray
public class OrdArray {
	private long[] a; // ref to array a
	private int nElems; // number of data items

	// -----------------------------------------------
	public OrdArray(int max) {
		init(max);
	}

	public OrdArray() {
		init(100);
	}

	private void init(int max) {
		a = new long[max];
		nElems = 0;
	}

	public int size() {
		return nElems;
	}

	public boolean isEmpty() {
		return nElems == 0;
	}

	public int find(long searchKey) {
		int lowerBound = 0;
		int upperBound = nElems - 1;
		int curIn;
		int searchCount = 0;
		while (true) {
			searchCount ++;
			curIn = (lowerBound + upperBound) / 2;
			if (a[curIn] == searchKey){
				println("查找次数" + searchCount);
				return curIn;
			} else if (lowerBound > upperBound) {
				return nElems;
			} else {
				if (a[curIn] < searchKey)
					lowerBound = curIn + 1;// it's in upper half
				else
					upperBound = curIn - 1;
			}// end else divide range
		} // end while
	}// end find()

	public void insert(long value) { // put element into array
		int j;
		for (j = 0; j < nElems; j++)
			if (a[j] > value)
				break;
		for (int k = nElems; k > j; k--)
			a[k] = a[k - 1];
		a[j] = value;
		nElems++;
	}

	public boolean delete(long value) {
		int j = find(value);
		if (j == nElems) {
			return false;
		} else {
			for (int k = j; k < nElems; k++) {
				a[k] = a[k+1];
			}
			nElems --;
			return true;
		}
	}
	
	public void display() {
		for (int j = 0; j < nElems; j++) {
			System.out.print(a[j] + "  ");
		}
		System.out.println("");
	}
}