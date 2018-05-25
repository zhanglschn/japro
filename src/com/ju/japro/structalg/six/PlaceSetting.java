package com.ju.japro.structalg.six;
import static com.ju.japro.common.util.Print.print;

class Plate {
	Plate(int i) {
		print("Plage constructor");
	}
}

class DinnerPlate extends Plate {
	DinnerPlate(int i) {
		super(i);
		print("DinnerPlate constructor");
	}
}

class Utensil {
	Utensil(int i) {
		print("Utensil constructor");
	}
}

class Spoon extends Utensil {
	Spoon(int i) {
		super(i);
		print("Spoon constructor");
	}
}

class Fork extends Utensil {
	Fork(int i) {
		super(i);
		print("Fork constructor");
	}
}

class Knife extends Utensil {
	Knife(int i) {
		super(i);
		print("Knife constructor");		
	}
}

class Custom {
	Custom(int i) {
		print("Custom constructor");
	}
}

public class PlaceSetting extends Custom{
	private Spoon spoon;
	private Fork fork;
	private Knife knife;
	private DinnerPlate dp;
	
	PlaceSetting(int i) {
		super(i);
		spoon = new Spoon(i + 2);
		fork = new Fork(i + 3);
		knife = new Knife(i + 4);
		dp = new DinnerPlate(i + 5);
		
		print("PlaceSetting constructor");
	}
	
	public static void main(String[] args) {
		PlaceSetting x = new PlaceSetting(9);
	}
	
}