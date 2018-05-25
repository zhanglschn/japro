package com.ju.japro.structalg.ten.innerclasses;

import static com.ju.japro.common.util.Print.print;

class Egg {
	private Yolk y;
	protected class Yolk {
		public Yolk() {
			print();
		}
	}
	public Egg() {
		print("New Egg()");
		y = new Yolk();
	}
	
}

public class BigEgg extends Egg {
	public class Yolk {
		public Yolk() {
			print("BigEgg.Yolk()");
		}
	}
	public static void main(String[] args) {
		new BigEgg();
	}
}