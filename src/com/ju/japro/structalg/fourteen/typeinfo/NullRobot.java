package com.ju.japro.structalg.fourteen.typeinfo;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Collections;
import java.util.List;

import com.ju.japro.util.Null;

class NullRobotProxyHandler implements InvocationHandler {
	private String nullName;
	private Robot proxied = new NRotbot();

	NullRobotProxyHandler(Class<? extends Robot> type) {
		nullName = type.getSimpleName() + " NullRobot";
	}

	private class NRotbot implements Null, Robot {
		public String name() {
			return nullName;
		}

		public String model() {
			return nullName;
		}

		public List<Operation> operations() {
			return Collections.emptyList();
		}
	}

	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		return method.invoke(proxied, args);
	}

}

public class NullRobot {
	public static Robot newNullRobot(Class<? extends Robot> type) {
		return (Robot) Proxy.newProxyInstance(NullRobotProxyHandler.class.getClassLoader(), 
				new Class[] { Null.class, Robot.class }, 
				new NullRobotProxyHandler(
				type));
	}

	public static void main(String[] args) {
		Robot[] bots = { new SnowRemovalRobot("SnowBee"), newNullRobot(SnowRemovalRobot.class) };
		for (Robot bot : bots) {
			Robot.Test.test(bot);
		}
	}
}