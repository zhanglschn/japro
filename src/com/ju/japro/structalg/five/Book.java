package com.ju.japro.structalg.five;
import static com.ju.japro.structalg.two.util.Util.println;

public class Book {
	boolean checkedOut = false;
	
	public Book(boolean _checkedOut){
		this.checkedOut = _checkedOut;
	}
	public void checkIn() {
		this.checkedOut = false;
	}
	
	protected void finalize() {
		if (this.checkedOut) {
			println("Error : checked out");
		}
	}
}