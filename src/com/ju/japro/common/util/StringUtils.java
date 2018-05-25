package com.ju.japro.common.util;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

/**
 * 字符串工具类
 *
 */
public class StringUtils extends org.apache.commons.lang.StringUtils {
	
	public static String rightPadorSub(String str, int size, char pader) {
		if(isEmpty(str)) {
			str = "";
		}
		
		if(str.length() > size) {
			return str.substring(0, size);
		}
		
		return rightPad(str, size, pader);
	}
	
	public static List<String> cutStringLength(String content, int size) {
		if(StringUtils.isEmpty(content)) {
			return null;
		}
		
		List<String> contents = new ArrayList<String>();
		
		final int _size = size;
		int _curr = 0;
		while(content.length() > _curr) {
			if(_curr + _size >= content.length()) {
				contents.add(content.substring(_curr, content.length()));
				_curr = _curr + _size;
			} else {
				contents.add(content.substring(_curr, _curr + _size));
				_curr = _curr + _size;
			}
			
		}
		
		return contents;
	}
	
	public static List<String> cutstringGBK(String content, int size) {
		if(StringUtils.isEmpty(content)) {
			return null;
		}
		
		List<String> contents = new ArrayList<String>();
		
		byte[] bt = null;
		try {
			bt = content.getBytes("GBK");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		
		byte[] bTemp = null;
		int ii = 0;
		final int _size = size;
		int _curr = 0;
		if(bt != null) {
			while(bt.length > _curr) {
				bTemp = new byte[_size];
				ii = 0;
				for(int i = _curr, j = 0; i < _curr + _size && i < bt.length; i++, j++) {
					bTemp[j] = bt[i];
					 
					if(bt[i] < 0) {
						ii++;
					}
				}
				
				if(ii % 2 == 1) {
					try {
						contents.add(new String(bTemp, 0, _size - 1, "GBK"));
						_curr = _curr + _size - 1;
					} catch (UnsupportedEncodingException e) {
						e.printStackTrace();
					}
				} else {
					try {
						contents.add(new String(bTemp, 0, _size, "GBK"));
						_curr = _curr + _size;
					} catch (UnsupportedEncodingException e) {
						e.printStackTrace();
					}
				}
			}
			
		}
		
		return contents;
	}
	
	/**
	 * 右补位
	 * @param oriStr
	 * @param len
	 * @param alexin
	 * @return
	 * @throws RouterException 
	 */
	public static String padRight(String oriStr, int len, byte b) {
		int strlen = 0;
			try {
				strlen = oriStr.getBytes("gbk").length;
			} catch (UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		String str = "";
		if (strlen < len) {
			for (int i = 0; i < len - strlen; i++) {
				str = str + (char)b;
			}
		}
		str = oriStr + str;
		return str;
	}
	/**
	 * 左补位
	 * @param oriStr
	 * @param len
	 * @param b
	 * @return
	 * @throws RouterException
	 */
	public static String padLeft(String oriStr, int len, byte b) {
		int strlen = 0;
			try {
				strlen = oriStr.getBytes("gbk").length;
			} catch (UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		String str = "";
		if (strlen < len) {
			for (int i = 0; i < len - strlen; i++) {
				str = (char)b + str;
			}
		}
		str = str + oriStr;
		return str;
	}
	public static String rightPadWithBytes(String str, int size, char padChar, String encoding)
    {
        return padWithBytes(str, size, padChar, encoding, false);
    }
	
	private static String padWithBytes(String str, int size, char padChar, String encoding, boolean isLeft)
    {
        if(str == null)
            return null;
        int strLen;
        try
        {
            strLen = str.getBytes(encoding).length;
        }
        catch(UnsupportedEncodingException e)
        {
            throw new RuntimeException((new StringBuilder("UnsupportedEncoding:")).append(encoding).toString(), e);
        }
        int pads = size - strLen;
        if(pads <= 0)
            return str;
        char padChars[] = new char[pads];
        for(int i = 0; i < padChars.length; i++)
            padChars[i] = padChar;

        if(isLeft)
            return (new StringBuilder(String.valueOf(new String(padChars)))).append(str).toString();
        else
            return (new StringBuilder(String.valueOf(str))).append(new String(padChars)).toString();
    }
}