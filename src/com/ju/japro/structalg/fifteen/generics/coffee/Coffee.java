package com.ju.japro.structalg.fifteen.generics.coffee;

public class Coffee {
	private static Long counter = 0L;
	private final long id = counter++;

	public String toString() {
		return new StringBuilder(getClass().getSimpleName()).append("  ").append(id).toString();
	}
}