package com.ju.japro.common.util;

public class TwoTuple<A, B> {
	public final A first;
	public final B second;

	public TwoTuple(A a, B b) {
		this.first = a;
		this.second = b;
	}

	public String toString() {
		return new StringBuilder().append("(").append(first).append(",  ").append(second).append(")").toString();
	}
}
