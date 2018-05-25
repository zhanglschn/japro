package com.ju.japro.structalg.two.clone;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Outer implements java.io.Serializable{
	private static final long serialVersionUID = 31415279568L;
	
	public Inner inner;
	
	//Discription:[深度复制方法，需要对象及对象所有的对象属性都实现序列化]
	
	public Outer myClone() {
		Outer outer = null;
		try {
			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			ObjectOutputStream oos = new ObjectOutputStream(baos);
			oos.writeObject(this);
			
			//讲流序列化成对象
			ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
			
			ObjectInputStream ois = new ObjectInputStream(bais);
			outer = (Outer) ois.readObject();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return outer;
	}
}