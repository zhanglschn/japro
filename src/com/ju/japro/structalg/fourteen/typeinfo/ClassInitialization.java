package com.ju.japro.structalg.fourteen.typeinfo;

import static com.ju.japro.common.util.Print.*;

import java.util.Random;

class Initable {
	static final int staticFinal = 47;
	static final int staticFinal2 = ClassInitialization.rand.nextInt(1000);
	static {
		print("Initializing Initable");
	}
}

class Initable2 {
	static int staticNonFinal = 147;
	static {
		print("initializing Initable2");
	}
}

class Initable3 {
	static int staticNonFinal = 74;
	static {
		print("Initializing Initable3");
	}
}


public class ClassInitialization {
	public static Random rand = new Random(47);
	public static void main(String[] args) throws Exception {
//		Class initable = Initable.class;
//		print("After creating Initable ref");
//		print(Initable.staticFinal);
//		print(Initable.staticFinal2);
//		print(Initable2.staticNonFinal);
		Class initable3 = Class.forName("com.ju.japro.structalg.fourteen.typeinfo.Initable3");
		print("After creating Initable3 ref");
		print(Initable3.staticNonFinal);
		
	}
}