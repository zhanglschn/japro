package com.ju.japro.jaxb;

import java.io.StringReader;
import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class TestJaxb {
	
	public static void main(String[] args) {
//		test01();
//		test02();
		String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?><ROOT><id>1</id><name>张三</name><age>21</age><classroom><grade>2010</grade><id>1</id><name>10计算机应用技术</name></classroom><address>上海市</address></ROOT>";
		Student stu = (Student)test04(xml,Student.class);
//		test02();
		System.out.println(stu.getName());
	}
	
	/**
     * 将java对象转成xml
     */
    public static void test03() {
        try {
            JAXBContext ctx = JAXBContext.newInstance(DrawReqDto.class);
            Marshaller marshaller = ctx.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true); 
            marshaller.setProperty("jaxb.encoding", "GBK");
//            marshaller.setProperty(Marshaller.JAXB_FRAGMENT, Boolean.FALSE);
//            marshaller.setProperty(Marshaller.JAXB_FRAGMENT, true);
            
            DrawReqDto stu = new DrawReqDto();
            stu.setFunCod("7001");
            stu.setCompOrgCode("01102");
            stu.setMAC("123");
            stu.setReqLogNo("123");
            stu.setShopNo("123");
            StringWriter writer = new StringWriter();
            marshaller.marshal(stu, writer);
            String str = writer.toString().replace("standalone=\"yes\"", "").replace(" ?>", "?>"); 
            System.out.println(str);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
	
    /**
     * 将java对象转成xml
     */
    public static void test01() {
        try {
            JAXBContext ctx = JAXBContext.newInstance(Student.class);
            Marshaller marshaller = ctx.createMarshaller();
            Student stu = new Student(1,"张三",21,new Classroom(1,"10计算机应用技术",2010),null);
            marshaller.marshal(stu, System.out);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
    
    public static Object test04(String xmlStr,Class<?> load) {
    	try {
    		JAXBContext ctx = JAXBContext.newInstance(load);
            Unmarshaller um = ctx.createUnmarshaller();
            return (Object)um.unmarshal(new StringReader(xmlStr));
    	} catch(Exception e) {
    		return null;
    	}
    }
    
    /**
     * 将xml转成java对象
     */
    public static void test02() {
        try {
            String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?><ROOT><id>1</id><name>张三</name><age>21</age><classroom><grade>2010</grade><id>1</id><name>10计算机应用技术</name></classroom><address>上海市</address></ROOT>";
            JAXBContext ctx = JAXBContext.newInstance(Student.class);
            Unmarshaller um = ctx.createUnmarshaller();
            Student stu = (Student)um.unmarshal(new StringReader(xml));
            System.out.println(stu.getName()+","+stu.getClassroom().getName());
        } catch (JAXBException e) {
            e.printStackTrace();
        }
        
    }
}
