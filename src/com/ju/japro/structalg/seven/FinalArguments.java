package com.ju.japro.structalg.seven;

import com.ju.japro.common.util.Print;

class Gizmo {
	public void spin() {}
}

public class FinalArguments {
	void with(final Gizmo g) {
		 //g = new Gizmo();
	}
	void withOut(Gizmo g) {
		g = new Gizmo();
		g.spin();
	}
	
	//void f(final int i) {i++;}
	
	int g(final int i) {return  i+1;}
	
	int gf(final int i) {
		return i+2;
	}
	public static void main(String[] args) {
		FinalArguments bf = new FinalArguments();
		bf.withOut(null);
		bf.with(null);
		Print.print(bf.g(234));
	}
}