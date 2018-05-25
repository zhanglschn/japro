package com.ju.japro.thread;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<Integer> {
	private int i = 0;
	
	public Integer call() throws Exception {
		int sum = 0;
		for (;i < 100; i++) {
			ThreadTest.pr(Thread.currentThread().getName() + "" + i);
			sum +=i;
		}
		return sum;
	}

}
