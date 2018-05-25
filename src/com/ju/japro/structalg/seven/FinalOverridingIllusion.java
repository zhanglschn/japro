package com.ju.japro.structalg.seven;

import static com.ju.japro.common.util.Print.print;

class WithFinals {
	public void show() {
		print(1);
	}
}

public class FinalOverridingIllusion extends WithFinals{
	public void show() {
		print(2);
	}
	
	public static void main(String[] args) {
		FinalOverridingIllusion fo = new FinalOverridingIllusion();
		fo.show();
	}
}