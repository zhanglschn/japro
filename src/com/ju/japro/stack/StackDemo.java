package com.ju.japro.stack;

import java.util.Stack;

public class StackDemo {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Stack<String> st = new Stack<String>();
		
		
		st.push("a");
		st.push("b");
		st.push("c");
		
		
		st.push("a");
		System.out.println(st.toString());
	}
}