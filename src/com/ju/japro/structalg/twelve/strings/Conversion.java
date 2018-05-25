package com.ju.japro.structalg.twelve.strings;

import java.math.BigInteger;
import java.util.Formatter;

public class Conversion {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Formatter f = new Formatter(System.out);
		
		// d 整数型（十进制）
		// c Unicode字符
		// b Boolean值
		// s String
		// f 浮点数(十进制)
		// e 浮点数（科学计数）
		// x 整数(十六进制)
		// h 散列码（十六进制）
		// % 字符“%”
		
		char u = 'a';
		System.out.println("u = 'a'");
		f.format("s: %s\n", u);
//		f.format("d: %d\n", u);
		f.format("c: %c\n", u);
		f.format("b: %b\n", u);
//		f.format("f: %f\n", u);
//		f.format("e: %e\n", u);
//		f.format("x: %x\n", u);
		f.format("h: %h\n", u);
		
		
		int v = 121;
		System.out.println("v = 121");
		f.format("d: %d\n", v);
		f.format("c: %c\n", v);
		f.format("b: %b\n", v);
		f.format("s: %s\n", v);
//		f.format("f: %f\n", v);
//		f.format("e: %e\n", v);
		f.format("x: %x\n", v);
		f.format("h: %h\n", v);
		
		
		BigInteger w = new BigInteger("50000000000000");
		System.out.println("w = new BigInteger(\"50000000000000\")");
		
		f.format("d: %d\n", w);
//		f.format("c: %c\n", w);
		f.format("b: %b\n", w);
		f.format("s: %s\n", w);
//		f.format("f: %f\n", w);
//		f.format("e: %e\n", w);
		f.format("x: %x\n", w);
		f.format("h: %h\n", w);
		
	}
}