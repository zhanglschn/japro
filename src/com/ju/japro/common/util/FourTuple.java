package com.ju.japro.common.util;

public class FourTuple<A, B, C, D> extends ThreeTuple<A, B, C> {
	public final D fourth;

	public FourTuple(A a, B b, C c, D d) {
		super(a, b, c);
		fourth = d;
	}

	public String toString() {
		return new StringBuilder("(").append(first).append(" ,").append(second).append(" ,").append(third).append("  ,").append(fourth).append(")").toString();
	}
}