package com.ju.japro.string;

import java.io.UnsupportedEncodingException;
import java.lang.reflect.Array;

public class StringEncoding {
	public static void encode() {
		String name = "I am 君山";
		toHex(name.toCharArray());
		try {
			byte[] iso8859 = name.getBytes("ISO-8859-1");
			toHex(iso8859);
			byte[] gb2312 = name.getBytes("GB2312");
			toHex(gb2312);
			byte[] gbk = name.getBytes("GBK");
			toHex(gbk);
			byte[] utf16 = name.getBytes("UTF-16");
			toHex(utf16);
			byte[] utf8 = name.getBytes("UTF-8");
			toHex(utf8);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	}

	public static void toHex(Object obj) {
		print(obj);
//		Class clazz = obj.getClass();
//		if( clazz.isArray() ) {
//			clazz.getEnumConstants();
//		}
//		
//		System.out.println(clazz.getComponentType());
//		
//		System.out.println(obj);
	}
	
	// 打印
    public static void print(Object obj) {
       Class<?> c = obj.getClass();
       if(!c.isArray()) {
    	   return;
       }
       System.out.println("数组" + c.getComponentType() +"长度为： " + Array.getLength(obj));
       for (int i = 0; i < Array.getLength(obj); i++) {
    	   System.out.print(Array.get(obj, i) + "   ");
       }
       System.out.println();
    }
	
	
	public static void main(String[] args) {
		encode();
	}
}
