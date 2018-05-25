package com.ju.japro.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class MyInvocationHandler implements InvocationHandler {
	private Object target;
	
	public MyInvocationHandler(Object target){
		this.target = target;
	}
	
	public Object invoke(Object paramObject, Method paramMethod,
			Object[] paramArrayOfObject) throws Throwable {
		System.out.println("--------before-------");
		Object result = paramMethod.invoke(target, paramArrayOfObject);
		System.out.println("--------end---------");
		return result;
	}
	
	public Object getProxy() {
		ClassLoader loader = Thread.currentThread().getContextClassLoader();
		Class<?>[] interfaces = target.getClass().getInterfaces();
		return Proxy.newProxyInstance(loader, interfaces, this);
	}
	
}