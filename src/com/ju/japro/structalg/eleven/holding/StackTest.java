package com.ju.japro.structalg.eleven.holding;

import java.util.Stack;

import com.ju.japro.common.util.Print;

public class StackTest {
	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		for (String st : "My god has fleas".split(" "))
			stack.push(st);
		while (!stack.empty())
			Print.printnb(stack.pop() + " ");
	}
}