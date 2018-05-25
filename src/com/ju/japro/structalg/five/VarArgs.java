package com.ju.japro.structalg.five;

import static com.ju.japro.common.util.Util.println;
import static com.ju.japro.common.util.Util.print;

public class VarArgs {
	static void printArray(Object[] args) {
		for (Object obj : args) {
			if (obj instanceof Example) {
				print(obj.toString() + " ,");
				continue;
			}
			print(obj + " ,");
		}
		println();
	}
	public static void main(String[] args) {
		printArray(new Object[]{new Integer(47),new Float(3.141516),new Double(11.1)});
		printArray(new Object[]{"one","two","three"});
		printArray(new Object[]{new Example("1"),new Example("2"),new Example("3")});
	}
}

class Example {
	private String mchntCode;
	
	public Example() {}
	public Example(String mchntCode) {
		this.mchntCode = mchntCode;
	}
	
	public String getMchntCode() {
		return mchntCode;
	}

	public void setMchntCode(String mchntCode) {
		this.mchntCode = mchntCode;
	}
	@Override
	public String toString() {
		return "Example [mchntCode=" + mchntCode + "]";
	}
}