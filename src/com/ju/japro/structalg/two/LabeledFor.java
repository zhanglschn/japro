package com.ju.japro.structalg.two;

import static com.ju.japro.structalg.two.util.Util.println;

public class LabeledFor {
	public static void main(String[] arguments) {
		int i = 0;
		outer: for (; true;) {
			inner: for (; i < 10; i++) {
				println("i = " + i);
				if (i == 2) {
					println("continue");
					continue;
				}

				if (i == 3) {
					println("break");
					i++;
					break;
				}
				if (i == 7) {
					println("continue outer");
					i++;
					continue outer;
				}
				if (i == 8) {
					println("break outer");
					break outer;
				}
				for (int k = 0; k < 5; k++) {
					if (k == 3) {
						println("continue inner");
						continue inner;
					}
				}
			}
		}
	}
}