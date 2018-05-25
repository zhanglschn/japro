package com.ju.japro.test;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

public class Test {
	/** 
     * 改变128位图中的标志为1 
     * @param fieldNo 
     * @param res 
     * @return 
     */  
    public static String change16bitMapFlag(String fieldNo, String res) {  
        int indexNo=Integer.parseInt(fieldNo);  
//        res = res.substring(0, indexNo-1) + "1" + res.substring(indexNo);  
        StringBuffer sb = new StringBuffer(res);
        sb.setCharAt(indexNo, '1');
        return sb.toString();  
    }  
	
	public static void main(String[] args) {
		String res1 = change16bitMapFlag("005","0000000000 0000000000 0000000000");
		System.out.println(res1);
	}
	
	public static void main3(String[] args) {
		String greeting = "Hello测试";
		int cpCount = greeting.codePointCount(0, greeting.length());
		System.out.println(greeting.charAt(cpCount-1));
		int index = greeting.offsetByCodePoints(0, 3);
		System.out.println("index=" + index);
//		String result = "a='a'&b='b'&c=1";
//		Map<String,String> map = convertResultStringToMap(result);
//		System.out.println(map.size());
	}
	
	public static Map<String, String> convertResultStringToMap(String result) {
		Map<String, String> map = null;
		try {
			if (result != null) {
				if (result.startsWith("{") && result.endsWith("}")) {
					result = result.substring(1, result.length() - 1);
				}
				map = parseQString(result);
			}
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		return map;
	}

	public static Map<String, String> parseQString(String str) throws UnsupportedEncodingException {
		Map<String, String> map = new HashMap<String, String>();
		int len = str.length();
		StringBuilder temp = new StringBuilder();
		String key = null;
		boolean isKey = true;
		boolean isOpen = false;
		char openName = '\0';
		if (len > 0) {
			for (int i = 0; i < len; i++) {
				char curChar = str.charAt(i);
				if (isKey) {
					if (curChar == '=') {
						key = temp.toString();
						temp.setLength(0);
						isKey = false;
					} else {
						temp.append(curChar);
					}
					continue;
				}
				if (isOpen) {
					if (curChar == openName)
						isOpen = false;
				} else {
					if (curChar == '{') {
						isOpen = true;
						openName = '}';
					}
					if (curChar == '[') {
						isOpen = true;
						openName = ']';
					}
				}
				if (curChar == '&' && !isOpen) {
					putKeyValueToMap(temp, isKey, key, map);
					temp.setLength(0);
					isKey = true;
				} else {
					temp.append(curChar);
				}
			}

			putKeyValueToMap(temp, isKey, key, map);
		}
		return map;
	}

	private static void putKeyValueToMap(StringBuilder temp, boolean isKey, String key, Map<String, String> map) throws UnsupportedEncodingException {
		if (isKey) {
			key = temp.toString();
			if (key.length() == 0)
				throw new RuntimeException("QString format illegal");
			map.put(key, "");
		} else {
			if (key.length() == 0)
				throw new RuntimeException("QString format illegal");
			map.put(key, temp.toString());
		}
	}
	
}