package com.ju.japro.structalg.five;

import static com.ju.japro.common.util.Util.println;

import java.util.Arrays;

public class DynamicArray {
	public static void main(String[] args) {
		//Other.main(new String[] { "fiddle", "de", "dum" });
		Other[] others = new Other[]{new Other("a"),new Other("b"),new Other("c"),};
		for (Other other : others) {
			println(other.toString());
		}
	}
}

class Other {
	private String mchn;
	public Other(String mchn) {
		this.setMchn(mchn);
	}
	
	public static void main(String[] args) {
		println(Arrays.toString(args));
	}


	public String getMchn() {
		return mchn;
	}

	public void setMchn(String mchn) {
		this.mchn = mchn;
	}

	@Override
	public String toString() {
		return "Other [mchn=" + mchn + "]";
	}
}