package com.ju.japro.structalg.two;

public class LowArray {
	private long[] array;

	public LowArray() {
		init(100);
	}

	public LowArray(int size) {
		init(size);
	}

	private void init(int size) {
		array = new long[size];
	}

	public void setElement(int index, long value) {
		if (index > array.length) {
			return;
		}
		array[index] = value;
	}

	public long getElement(int index) {
		return array[index];
	}

	public int searchElement(long searchKey) {
		int index = 0, i = 0;
		for (; i < array.length; i++) {
			if (array[i] == searchKey) {
				index = i;
				break;
			}
		}
		if (i == array.length) {
			pl("Can't find " + searchKey);
		} else {
			pl("Found:" + searchKey + ",index is :" + index);
		}
		return index;
	}

	public int delElement(long key, int nElems) {
		int index = searchElement(key);
		if (index == nElems) {
			return nElems;
		}

		for (int k = index; k < nElems; k++) {
			array[k] = array[k + 1];
		}
		nElems--;
		return nElems;
	}

	private void pl(Object obj) {
		System.out.println(obj);
	}
}