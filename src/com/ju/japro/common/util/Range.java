package com.ju.japro.common.util;

public abstract class Range {
	public final static int[] range(int n) {
		int[] result = new int[n];
		for (int i = 0; i < n; i++)
			result[i] = i;
		return result;
	}

	public final static int[] range(int start, int end) {
		int sz = end - start;
		int[] result = new int[sz];
		for (int i = 0; i < sz; i++)
			result[i] = start + i;
		return result;
	}

	public final static int[] range(int start, int end, int step) {
		int sz = (end - start) / step;
		int[] result = new int[sz];
		for (int i = 0; i < sz; i++) {
			result[i] = start + (i * step);
		}
		return result;
	}

	public final static void display(Object[] objs) {
		for (Object object : objs) {
			Print.print(object);
		}
	}

	public final static void display(int[] objs) {
		for (int object : objs) {
			Print.print(object);
		}
	}

	public final static void display(long[] objs) {
		for (long object : objs) {
			Print.print(object);
		}
	}

	public final static void display(String[] objs) {
		for (String object : objs) {
			Print.printnb(object + "   ");
		}
		
	}

	public static void main(String[] args) {
		int[] result = Range.range(10);
		Range.display(result);
	}
}