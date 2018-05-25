package com.ju.japro.structalg.six.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class TimeHandlerApp {

	public static void main(String[] args) throws Exception {
		/**
		 * JDK动态代理步骤 
		 * 1.创建一个实现InvocationHandler接口的类，它必须实现invoke()方法 
		 * 2.创建被代理的类及接口
		 * 3.调用Proxy的静态方法，创建一个代理类 
		 * 4.通过代理调用方法
		 */
		Car car = new Car();
		InvocationHandler h = new TimeHandler(car);
		Class<?> cls = car.getClass();
		Moveable m = (Moveable) Proxy.newProxyInstance(cls.getClassLoader(), cls.getInterfaces(), h);
		m.move();
	}
}