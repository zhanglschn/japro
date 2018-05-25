package com.ju.japro.proxy;

import java.util.Calendar;

public class ProxyTest1 {
	
	public static void main(String[] args) {
		System.out.println(ProxyTest1.getTimes());
	}
	/**
	 * 获取当前时间和隔日0点的秒数差， 用于存储redis的有效期
	 * 
	 * @return
	 */
	private static int getTimes() {
		// 获取当前时间
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.DAY_OF_MONTH, 1);// 日期+1
		calendar.set(Calendar.HOUR_OF_DAY, 0);// 置为0时
		calendar.set(Calendar.MINUTE, 0);// 置为0分
		calendar.set(Calendar.SECOND, 0);// 置为0秒
		int times = (int) ((calendar.getTimeInMillis() - System.currentTimeMillis()) / 1000);
		return times;
	}
	
	
	public static void main1(String[] args) throws Exception{
		Class clazz = Class.forName("com.ju.japro.proxy.UserServiceImpl");
		Service service = (UserServiceImpl)clazz.newInstance();
		MyInvocationHandler handler = new MyInvocationHandler(service);
		Service serviceProxy = (Service) handler.getProxy();
		serviceProxy.add();
	}
}
