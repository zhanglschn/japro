package com.ju.japro.test;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

import com.ju.japro.common.util.StringUtils;

public class BigFileRead {
	public static void main(String[] args) {
		long startTime=System.currentTimeMillis();   //获取开始时间
		try {
			int bufSize = 10240;
			byte[] bs = new byte[bufSize];
			ByteBuffer byteBuffer = ByteBuffer.allocate(10240);

			FileChannel channel = new RandomAccessFile("D:\\1.txt", "r").getChannel();
			
			String before = "";
			String after = "";
			int index = 1;
			boolean isFlag = false;
			while (channel.read(byteBuffer) != -1) {
				int size = byteBuffer.position();
				byteBuffer.rewind();
				byteBuffer.get(bs);
				
//				writeFile("D:\\1.txt", new String(new String(bs, 0, size, "GBK")));
				
				if (!isFlag) {
					if ((index&1)!=0) {
						before = new String(new String(bs, 0, size, "GBK"));
					} else {
						after = new String(new String(bs, 0, size, "GBK"));
						isFlag = true;
					}
				} else {
					after = new String(new String(bs, 0, size, "GBK"));
				}
				
				if (!StringUtils.isEmpty(before) && !StringUtils.isEmpty(after)) {
					String code1 = str2HexStr(before);
					String code2 = str2HexStr(after);
					
					int max = 0;
			    	if (code1.length() > code2.length()) {
			    		max = code1.length();
			    	} else {
			    		max = code2.length();
			    	}
			    	
			    	code1 = addZeroForNum(code1,max,"0");
			    	code2 = addZeroForNum(code2,max,"0");
			    	
					writeFile("D:\\3.txt",compare(code1,code2));
					before = after;
					after = "";
				}
				
				index +=1;
				byteBuffer.clear();
			}
			byteBuffer.clear();
			channel.close();
			long endTime=System.currentTimeMillis(); //获取结束时间
			System.out.println("程序运行时间： "+(endTime-startTime)+"ms");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static String str2HexStr(String str) {
		char[] chars = "0123456789ABCDEF".toCharArray();
		StringBuilder sb = new StringBuilder("");
		byte[] bs = str.getBytes();
		int bit;
		for (int i = 0; i < bs.length ;i++) {
			bit = (bs[i] & 0x0f0 ) >> 4;
			sb.append(chars[bit]);
			bit = bs[i] & 0x0f;
			sb.append(chars[bit]);
//			sb.append(' ');
		}
		return sb.toString().trim();
	}
	
	public static String compare(String code1, String code2) {
		String result = "";
		
		for (int i = 0; i < code1.length(); i++) {
			char c1 = code1.charAt(i);
			char c2 = code2.charAt(i);
			String a = convertHexToBinary(c1 + "");
			String b = convertHexToBinary(c2 + "");
			byte[] aa = a.getBytes();
			byte[] bb = b.getBytes();
			String cc = "";
			for (int j = 0; j < aa.length; j++) {
				cc += aa[j] ^ bb[j];
			}
			String tmp = Integer.toHexString(Integer.valueOf(cc, 2).intValue()).toString();

			result += tmp;
		}
		return result;
	}
	
	
	/** 
     * 补齐不足长度 
     * @param length 长度 
     * @param number 数字 
     * @return 
     */  
	public static String addZeroForNum(String str, int strLength,String cont) {  
	    int strLen = str.length();  
	    if (strLen < strLength) {  
	        while (strLen < strLength) {  
	            StringBuffer sb = new StringBuffer();  
	            sb.append(cont).append(str);// 左补0  
	            // sb.append(str).append("0");//右补0  
	            str = sb.toString();  
	            strLen = str.length();  
	        }  
	    }  
	  
	    return str;  
	} 
    
    
	public static String convertHexToBinary(String hexString) {
		long l = Long.parseLong(hexString, 16);
		String binaryString = Long.toBinaryString(l);
		int shouldBinaryLen = hexString.length() * 4;
		StringBuffer addZero = new StringBuffer();
		int addZeroNum = shouldBinaryLen - binaryString.length();
		for (int i = 1; i <= addZeroNum; i++) {
			addZero.append("0");
		}
		return addZero.toString() + binaryString;
	}

	public static void writeFile(String file, String content) {
		BufferedWriter out = null;
		try {
			out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file, true)));
			out.write(content);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (out != null) {
					out.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}