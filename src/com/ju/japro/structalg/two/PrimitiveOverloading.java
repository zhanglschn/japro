package com.ju.japro.structalg.two;

import static com.ju.japro.structalg.two.util.Util.print;
import static com.ju.japro.structalg.two.util.Util.println;

public class PrimitiveOverloading {
	void f1(char x) { print("f1(char)"); }
	void f1(byte x) { print("f1(byte)"); }
	void f1(short x) { print("f1(short)"); }
	void f1(int x) { print("f1(int)"); }
	void f1(long x) { print("f1(long)"); }
	void f1(float x) { print("f1(float)"); }
	void f1(double x) { print("f1(double)"); }
	
	void f2(byte x) { print("f2(byte)"); }
	void f2(short x) { print("f2(short)"); }
	void f2(int x) { print("f2(int)"); }
	void f2(long x) { print("f2(long)"); }
	void f2(float x) { print("f2(float)"); }
	void f2(double x) {	print("f2(double)"); }
	
	void f3(short x) { print("f3(short)"); }
	void f3(int x) { print("f3(int)"); }
	void f3(long x) { print("f3(long)"); }
	void f3(float x) { print("f3(float)"); }
	void f3(double x) { print("f3(double)"); }
	
	void f4(int x) { print("f4(int)"); }
	void f4(long x) { print("f4(long)"); }
	void f4(float x) { print("f4(float)"); }
	void f4(double x) { print("f4(double)"); }
	
	void f5(long x) { print("f5(long)"); }
	void f5(float x) { print("f5(float)"); }
	void f5(double x) { print("f5(double)"); }
	
	void f6(float x) { print("f6(float)"); }
	void f6(double x) { print("f6(double)"); }
	
	void f7(double x) { print("f7(double)"); }
	
	void testConstVal() {
		print("300000000：");
		f1(300000000);f2(999999999);f3(999999999);f4(999999999);f5(999999999);f6(999999999);f7(999999999);println();
	}
	
	void testChar() {
		char x = 'x';
		print("char：");
		f1(x);f2(x);f3(x);f4(x);f5(x);f6(x);f7(x);println();
	}
	
	void testByte() {
		byte x = 15;
		print("byte：");
		f1(x);f2(x);f3(x);f4(x);f5(x);f6(x);f7(x);println();
	}
	
	void testShort() {
		short x = 0;
		print("Short：");
		f1(x);f2(x);f3(x);f4(x);f5(x);f6(x);f7(x);println();
	}
	
	void testInt() {
		int x = 0;
		print("Int：");
		f1(x);f2(x);f3(x);f4(x);f5(x);f6(x);f7(x);println();
	}
	
	void testLong() {
		long x = 0;
		print("Long：");
		f1(x);f2(x);f3(x);f4(x);f5(x);f6(x);f7(x);println();
	}
	
	
	void testFloat() {
		float x = 0;
		print("Float：");
		f1(x);f2(x);f3(x);f4(x);f5(x);f6(x);f7(x);println();
	}
	
	void testDouble() {
		double x = 0;
		print("Double");
		f1(x);f2(x);f3(x);f4(x);f5(x);f6(x);f7(x);println();
	}
	
	public static void main(String[] args) {
		PrimitiveOverloading primitiveOverloading = new PrimitiveOverloading();
		primitiveOverloading.testConstVal();
		primitiveOverloading.testChar();
		primitiveOverloading.testByte();
		primitiveOverloading.testShort();
		primitiveOverloading.testInt();
		primitiveOverloading.testLong();
		primitiveOverloading.testFloat();
		primitiveOverloading.testDouble();
		primitiveOverloading.testLong();
	}
}