package com.ju.japro.exception;

public class Test {
	public static void main(String[] args) {
		
		int a = 24;
		System.out.println();
		
		char e = (char)a;
		System.out.println(e);
		
//		System.out.println("testest".charAt(6));
		
//		String str = "1";
//		if(str.startsWith("1")) {
//			System.out.println("1");
//		}
//		RespCodeEnum item = RespStatusEnum.successEquals("10000") ? RespCodeEnum.CODE_TO_BE_PROCESS_NORMAL : RespCodeEnum.CODE_FAIL_NORMAL;
//		System.out.println(item.getCode());
		/*System.out.println("t");
		 if(RespStatusEnum.typeEquals("10000", RespStatusEnum.STATUS_FAIL)){
			 System.out.println("t1");
		 }
		 System.out.println("t2");*/
	}
	
	public static void main1(String[] args) {
		new Test().test3();
	}
	
	public void test3() {
		test2();
	}
	
	public void test2() {
		try {
			test1();
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void test1() {
		throw new RuntimeException("RuntimeException");
	}
}