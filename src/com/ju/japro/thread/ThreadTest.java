package com.ju.japro.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class ThreadTest {
	public static void main(String[] args) {
		Callable<Integer> myCallable = new MyCallable();
		FutureTask<Integer> ft = new FutureTask<Integer>(myCallable);
		
		for (int i = 0; i < 100; i++) {
			pr(Thread.currentThread().getName() + " " + i);
			if (i == 30) {
				Thread thread = new Thread(ft);
				thread.start();
			}
		}
		pr("主线程for循环执行完毕...");
		
		try {
			int sum = ft.get();
			pr("sum = " + sum);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}
	}
	
	public static void pr(Object obj) {
		System.out.println(obj);
	}
}