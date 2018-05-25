package com.ju.japro.structalg.fourteen.typeinfo;

import java.lang.reflect.Method;

public class FieldList {
	public static void main(String[] args) {
		String condition = new StringBuilder()
        .append("分类：").append(StringUtils.isEmpty("") ? "全部" :
                Integer.parseInt("1")).toString();
		
		System.out.println(condition);
		
		
//		try {
//			Class<?>clzss = Class.forName("com.ju.japro.structalg.fourteen.typeinfo.BoundedClassReferences");
//			Method[] methods = clzss.getMethods();
//			
//			for (Method method : methods) {
//				System.out.println(method.getReturnType());
//			}
//		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
//		}
	}
}