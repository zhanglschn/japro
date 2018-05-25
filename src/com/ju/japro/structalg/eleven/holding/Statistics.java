package com.ju.japro.structalg.eleven.holding;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import com.ju.japro.common.util.Print;

public class Statistics {
	public static void main(String[] args) {
		Random rand = new Random(47);
		Map<Integer,Integer> m = new HashMap<Integer,Integer>();
		for (int i = 0; i < 10000; i ++) {
			int r = rand.nextInt(20);
			Integer freq = m.get(r);
			m.put(r, freq == null ? 1 : freq + 1);
		}
		Print.print(m);
	}
}