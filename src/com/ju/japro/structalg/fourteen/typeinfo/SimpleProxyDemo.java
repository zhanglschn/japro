package com.ju.japro.structalg.fourteen.typeinfo;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;


class DynamicProxyhandler implements InvocationHandler {

	private Object proxied;

	public DynamicProxyhandler(Object proxied) {
		this.proxied = proxied;
	}

	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

		System.out.println("**** proxy: " + proxy.getClass() + ", method: " + method + ", args : " + args);
		if (args != null) 
			for(Object arg : args) 
				System.out.println("   " + arg);
			
		
		return method.invoke(proxied, args);
	}
}

class SimpleDynamicProxy {
	public static void main(String[] args) {
		
		String condition = new StringBuilder()
        .append("分类：").append(StringUtils.isEmpty("") ? "全部" :
                Integer.parseInt("1")).toString();
		
		System.out.println(condition);
	}
}