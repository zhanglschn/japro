package com.ju.japro.structalg.fourteen.typeinfo;

import java.lang.reflect.Method;

import com.ju.japro.common.util.Print;
import com.ju.japro.structalg.fourteen.typeinfo.interfacea.A;
import com.ju.japro.structalg.fourteen.typeinfo.packageaccess.HiddenC;

public class HiddenImplementation {
	public static void main(String[] args) throws Exception {
		A a = HiddenC.makeA();
		a.f();

		Print.print(a.getClass().getName());

		callHidenMethod(a, "g");
		callHidenMethod(a, "u");
		callHidenMethod(a, "v");
		// callHidenMethod(a, "w");
	}

	public static void callHidenMethod(Object a, String methodName) throws Exception {
		// 动态获取class
		Method g = a.getClass().getDeclaredMethod(methodName);
		// 设置方法属性可修改
		g.setAccessible(true);
		// 触发对象的方法
		g.invoke(a);
	}
}