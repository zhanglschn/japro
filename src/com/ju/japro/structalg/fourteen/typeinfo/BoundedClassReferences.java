package com.ju.japro.structalg.fourteen.typeinfo;

public class BoundedClassReferences {
	public static void main(String[] args	) {
		Class<? extends Number> boundedClass = int.class;
		boundedClass = double.class;
		boundedClass = Number.class;
	}
}