package com.ju.japro.structalg.fifteen.generics;

import com.ju.japro.common.util.FourTuple;

import static com.ju.japro.common.util.Print.print;

import com.ju.japro.common.util.FiveTuple;
import com.ju.japro.common.util.ThreeTuple;
import com.ju.japro.common.util.TwoTuple;

class Amphibian {
}

class Vehicle {
}

public class TupleTest {
	static TwoTuple<String, Integer> f() {
		return new TwoTuple<String, Integer>("hi", 47);
	}

	static ThreeTuple<Amphibian, String, Integer> g() {
		return new ThreeTuple<Amphibian, String, Integer>(new Amphibian(), "hi", 47);
	}

	static FourTuple<Vehicle, Amphibian, String, Integer> h() {
		return new FourTuple<Vehicle, Amphibian, String, Integer>(new Vehicle(), new Amphibian(), "hi", 47);
	}

	static FiveTuple<Vehicle, Amphibian, String, Integer, Double> k() {
		return new FiveTuple<Vehicle, Amphibian, String, Integer, Double>(new Vehicle(), new Amphibian(), "hi", 47, 11.1);
	}

	public static void main(String[] args) {
		TwoTuple<String, Integer> ttsi = f();
		print(ttsi);
		print(g());
		print(h());
		print(k());

	}
}