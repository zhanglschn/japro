package com.ju.japro.structalg.two.clone.app;

import static com.ju.japro.structalg.two.util.Util.println;

import com.ju.japro.structalg.two.clone.Address;
import com.ju.japro.structalg.two.clone.Student;

public class StudentTest {
	public static void main(String[] args) {
		/*Student student1 = new Student();
		student1.setNumber(12345);
		Student student2 = student1;
		
		
		println("修改前");
		println("学生1：" + student1.getNumber());
		println("学生2：" + student2.getNumber());
		
		student2.setNumber(654321);
		
		println("修改后");
		println("学生1：" + student1.getNumber());
		println("学生2：" + student2.getNumber());
		*/
		Address addr = new Address();
		addr.setAdd("杭州市");
		
		Student stu1 = new Student();
		stu1.setNumber(12345);
		stu1.setAddr(addr);
		
		Student stu2 = (Student) stu1.clone();
		
		println("修改前");
		println("学生1：" + stu1.getNumber() + ",地址：" + stu1.getAddr().getAdd());
		println("学生2：" + stu2.getNumber() + ",地址：" + stu2.getAddr().getAdd());
		
		addr.setAdd("西湖区");
		
		println("修改后");
		println("学生1：" + stu1.getNumber() + ",地址：" + stu1.getAddr().getAdd());
		println("学生2：" + stu2.getNumber() + ",地址：" + stu2.getAddr().getAdd());
		
		println("2个对象是否对等：" + (stu1 == stu2));
		
		
	}
}