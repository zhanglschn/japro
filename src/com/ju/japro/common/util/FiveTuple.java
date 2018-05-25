package com.ju.japro.common.util;

public class FiveTuple<A, B, C, D, E> extends FourTuple<A, B, C, D> {
	public final E fifth;

	public FiveTuple(A a, B b, C c, D d, E e) {
		super(a, b, c, d);
		this.fifth = e;
	}

	public String toString() {
		return new StringBuilder("(").append(first).append(" ,").append(second).append(" ,").append(third).append("  ,").append(fourth).append("  ,")
				.append(fifth).append(")").toString();
	}
}