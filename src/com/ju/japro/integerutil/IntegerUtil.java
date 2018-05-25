package com.ju.japro.integerutil;

public class IntegerUtil {
	/**
	 * 十进制转成十六进制
	 * @param i
	 * @return
	 */
	public static String I10To16(int i) {
		return Integer.toHexString(i);
	}
	
	/**
	 * 十进制转成八进制 
	 * @param i
	 * @return
	 */
	public static String I10To8(int i) {
		return Integer.toOctalString(i);
	}
	
	/**
	 * 十进制转成二进制
	 * @param i
	 * @return
	 */
	public static String I10To2(int i) {
		return Integer.toBinaryString(i);
	}
	
	public static String In10To2(int n) {
//		int n = -10;
        String result = "";
        boolean minus = false;

        //如果该数字为负数，那么进行该负数+1之后的绝对值的二进制码的对应位取反，然后将它保存在result结果中
        if(n < 0){
            minus = true;
            n = Math.abs(n + 1);
        }

        while(true){
            int remainder = (!minus && n % 2 == 0) || (minus && n % 2 == 1) ? 0 : 1;

            //将余数保存在结果中
            result = remainder + result;
            n /= 2;

            if(n == 0){
                break;
            }
        }

        //判断是否为负数，如果是负数，那么前面所有位补1
        if(minus){
            n = result.length();
            for(int i = 1; i <= 32 - n; i++){
                result = 1 + result;
            }
        }

//        System.out.println(result);
        return result;
	}
}