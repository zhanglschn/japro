package com.ju.japro.convert;

public class IntUtil {
	public static void LeftMoving() {
		int x = 5;
		String strIn = Integer.toBinaryString(x);
		System.out.println(addBlankLeftForLength(strIn,32,"0"));
		x = x << 4;
		strIn = Integer.toBinaryString(x);
		System.out.println(addBlankLeftForLength(strIn,32,"0"));
		System.out.println("x=" + x + ",x1=" + 10 * Math.pow(2,4));
	}
	
	public static void PlusRightMoving() {
		int x = 15;
		String strIn = Integer.toBinaryString(x);
		System.out.println(addBlankLeftForLength(strIn,32,"0"));
		x = x >> 2;
		
		System.out.println(Integer.rotateLeft(x, 2));
		
		strIn = Integer.toBinaryString(x);
		System.out.println(addBlankLeftForLength(strIn,32,"0"));
		System.out.println("x=" + x + ",x1=" + 10 / Math.pow(2,2));
	}
	
	public static void UnsignedRightMoving() {
		int x = -5;
		String strIn = Integer.toBinaryString(x);
		System.out.println(strIn);
		
		x = x >> 4;
		strIn = Integer.toBinaryString(x);
//		System.out.println(addBlankLeftForLength(strIn,32,"0"));
		System.out.println(strIn + "x=" + x);
	}
	
	
	public static void NegativeRightMoving() {
		int x = -5;
		System.out.println(Integer.toBinaryString(x >> 1));
	}
	
	public static void main(String[] args) {
		UnsignedRightMoving();
	}
	
	private static String addBlankLeftForLength(String code, int length, String string) {
		int len = length - code.length();
		if (len <= 0) {
			return code;
		}
		return addBlankLeft(code,len,string);
	}
	
	private static String addBlankLeft(String code, int addLen, String string) {
		if (code != null && code.length() == 0) {
			throw new IllegalArgumentException("参数lengh不能等于0");
		}
		if (addLen < 0) {
			throw new IllegalArgumentException("添加个数不能为负数");
		}
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < addLen; i++) {
			sb.append(string);
		}
		sb.append(code);
		return sb.toString();
	}
}