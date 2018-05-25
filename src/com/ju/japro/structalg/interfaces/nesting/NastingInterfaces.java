package com.ju.japro.structalg.interfaces.nesting;

import static com.ju.japro.common.util.Print.print;

interface Cycle {
	public void f();
}
interface CycleFactory{
	Cycle getCycle();
}

class Unicycle implements Cycle {
	public void f() {
		print("Unicycle f");
	}
}

class UincycleFactory implements CycleFactory {
	public Cycle getCycle() {
		return new Unicycle();
	}
}


class Bicycle implements Cycle {
	public void f() {
		print("Bicycle f");
	}
}

class BicycleFactory implements CycleFactory{
	public Cycle getCycle() {
		return new Bicycle();
	}
}

class Tricycle implements Cycle {
	public void f() {
		print("Tricycle f");
	}
}

class TricycleFactory implements CycleFactory{
	public Cycle getCycle() {
		return new Tricycle();
	}
}

public class NastingInterfaces {
	public static void chooseCycle(CycleFactory factory) {
		Cycle cycle = factory.getCycle();
		cycle.f();
	}
	
	public static void main(String[] args) {
		chooseCycle(new UincycleFactory());
		chooseCycle(new BicycleFactory());
		chooseCycle(new TricycleFactory());
	}
}