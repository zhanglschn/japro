package com.ju.japro.structalg.two;

// HightArray.java
// demonstrates array class with height-level interace
// to run this program
public class HightArray {
	private long[] a;
	private int nElems;

	public HightArray(int max) {
		a = new long[max];
		nElems = 0;
	}

	/**
	 * 可能查找<=nElems
	 * 
	 * @param searchKey
	 *            搜索的关键字
	 * @return
	 */
	public boolean find(long searchKey) {
		int j;
		for (j = 0; j < nElems; j++)
			if (a[j] == searchKey)
				break;

		return j == nElems ? false : true;
	}

	/**
	 * 新增数据，并且数据集合长度+1
	 * 
	 * @param value
	 */
	public void insert(long value) {
		a[nElems] = value;
		nElems++;
	}

	public boolean delete(long value) {
		int j;
		for (j = 0; j < nElems; j++)
			if (value == a[j])
				break;

		if (j == nElems)
			return false;
		else {
			for (int k = j; k < nElems; k++)
				a[k] = a[k + 1];
			nElems--;
			return true;
		}
	}

	public void display() {
		for (int j = 0; j < nElems; j++) {
			p(a[j] + " ");
			if (j < nElems - 1) {
				System.out.print(",");
			}
		}
		pl();
	}

	private void p(Object obj) {
		System.out.print(obj);
	}

	private void pl() {
		pl("");
	}

	private void pl(Object obj) {
		System.out.println(obj);
	}

}