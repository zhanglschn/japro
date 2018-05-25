package com.ju.japro.structalg.six.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

import static com.ju.japro.common.util.Print.print;

public class TimeHandler implements InvocationHandler{
	private Object target;
	public TimeHandler(Object _target) {
		this.target = _target;
	}
	
	/**
	 * @description 反射对象
	 * @param proxy 被代理的对象
	 * @param method 被代理对象的方法
	 * @param args 方法参数
	 * @return 方法返回值。
	 */
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		long startTime = System.currentTimeMillis();
		print("汽车开始行驶...");
		
		method.invoke(target, args);
		
		long endTime = System.currentTimeMillis();
		print("汽车行驶结束，所消耗时间：" + (endTime - startTime) + "毫秒");
		return null;
	}
}