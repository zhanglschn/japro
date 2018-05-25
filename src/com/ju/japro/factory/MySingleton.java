package com.ju.japro.factory;

import java.io.ObjectStreamException;
import java.io.Serializable;

public class MySingleton implements Serializable{
	private static final long serialVersionUID = 1L;
	/**
	private volatile static MySingleton instance = null;
	private MySingleton() {
	}

	public static MySingleton getInstance() {
		try {
			if (instance != null) {
			} else {
				// 创建实例之前可能会有一些准备性的耗时工作
				Thread.sleep(300);
				synchronized (MySingleton.class) {
					if (instance == null) {
						instance = new MySingleton();
					}
				}
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return instance;
	}
	*/
	/**
	private static class MySingletonHandler {
		private static MySingleton instance = new MySingleton();
	}
	private MySingleton(){}
	public static MySingleton getInstance() {
		return MySingletonHandler.instance;
	}
	
	 //该方法在反序列化时会被调用，该方法不是接口定义的方法，有点儿约定俗成的感觉  
    protected Object readResolve() throws ObjectStreamException {  
        System.out.println("调用了readResolve方法！");  
        return MySingletonHandler.instance;   
    }  
	*/
	
	private static MySingleton instance = null;
	private MySingleton(){}  
	  
    static{  
        instance = new MySingleton();  
    }  
      
    public static MySingleton getInstance() {   
        return instance;  
    }   
}