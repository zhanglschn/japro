package com.ju.japro.structalg.five;
import static com.ju.japro.common.util.Util.print;
import static com.ju.japro.common.util.Util.println;
public class NewVarArgs {
	static void printArray(Object... args) {
		for(Object obj : args) {
			if (obj instanceof Example) {
				print(obj.toString() + " ,");
				continue;
			}
			print(obj + " ,");
		}
		println();
	}
	
	public static void main(String[] args) {
		printArray(47,3.14F,11.11);
		printArray("one","two","three");
		printArray(new Example("1"));
		printArray((Object[]) new Integer[]{1,2,3,4});
	}
}

