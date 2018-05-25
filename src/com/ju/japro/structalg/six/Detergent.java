package com.ju.japro.structalg.six;

import static com.ju.japro.common.util.Print.print;

class Cleanser {
	private StringBuilder s = new StringBuilder("Cleanser");
	
	public Cleanser() {
		s = new StringBuilder("is new Cleanser");
		print("Cleanser custract");
	}
	
	public Cleanser append(String a) {
		s.append(a);
		return this;
	}

	public Cleanser dilute() {
		append(" dilute()");
		return this;
	}

	public Cleanser apply() {
		append(" apply()");
		return this;
	}

	public Cleanser scrub() {
		append(" scrub()");
		return this;
	}

	@Override
	public String toString() {
		return s.toString();
	}

	public static void main(String[] arguments) {
		Cleanser x = new Cleanser();
		x.dilute().apply().scrub();
		print(x);
	}
}

public class Detergent extends Cleanser {
	
	public Detergent() {
		print("Detergent custract");
	}
	@Override
	public Detergent scrub() {
		append(" Detergent.scrub()");
		super.scrub();
		return this;
	}

	public Detergent foam() {
		append(" foam()");
		return this;
	}
	
	public static void main(String[] args) {
		Detergent detergent = new Detergent();
		detergent.dilute().apply().scrub();
		detergent.foam();
		
		print(detergent);
		
		Cleanser.main(args);
	}
}