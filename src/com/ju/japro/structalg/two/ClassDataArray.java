package com.ju.japro.structalg.two;

public class ClassDataArray {
	private Person[] a;
	private int nElems;

	public ClassDataArray(int max) {
		a = new Person[max];
		nElems = 0;
	}

	public Person find(String searchName) {
		int j;
		for (j = 0; j < nElems; j++)
			if (a[j].getLastName().equals(searchName))
				break;
		if (j == nElems) {
			return null;
		} else {
			return a[j];
		}
	}

	public void insert(String last, String first, int age) {
		a[nElems] = new Person(last, first, age);
		nElems++;
	}

	public boolean delete(String searchName) {
		if (searchName == null || searchName.length() == 0) {
			return false;
		}

		int j;
		for (j = 0; j < nElems; j++) {
			if (a[j].getLastName().equals(searchName)) {
				break;
			}
		}

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
		if (nElems == 0)
			return;
		for (int j = 0; j < nElems; j++)
			a[j].displayPerson();
	}
}