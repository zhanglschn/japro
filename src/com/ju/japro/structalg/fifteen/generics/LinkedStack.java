package com.ju.japro.structalg.fifteen.generics;

import com.ju.japro.common.util.Print;

public class LinkedStack<T> {
	private static class Node<U> {
		U item;
		Node<U> next;
		Node() {
			this.item = null;
			this.next = null;
		}
		Node(U item,Node<U> next) {
			this.item = item;
			this.next = next;
		}
		boolean end() {
			return item == null && next == null;
		}
	}
	private Node<T> top = new Node<T>();
	public void push(T item) {
		top = new Node<T>(item,top);
	}
	public T pop() {
		T result = top.item;
		if (!top.end()) {
			top = top.next;
		}
		return result;
	}
	
	public static void main(String[] args) {
		LinkedStack<String> lss = new LinkedStack<String>();
		for (String str : "Phasers or stun!".split(" "))
			lss.push(str);
		String str;
		while ((str = lss.pop()) != null) {
			Print.print(str);
		} 
	}
}