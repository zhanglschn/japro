package com.ju.japro.convert;

public class CommonConvertUtil {
	
	/**
	 * 
	 * @param value
	 * @return
	 */
	public static byte[] intToBytes(int  value) {
		byte[] src = new byte[4];
		src[3] = (byte) ((value >> 24) & 0xFF);
		src[2] = (byte) ((value >> 16) & 0xFF);
		src[1] = (byte) ((value >> 8) & 0xFF);
		src[0] = (byte) (value & 0xFF);
		return src;
	}
	
	
    //byte 数组与 int 的相互转换  
    public static int byteArrayToInt(byte[] b) {  
        return   b[3] & 0xFF |  
                (b[2] & 0xFF) << 8 |  
                (b[1] & 0xFF) << 16 |  
                (b[0] & 0xFF) << 24;  
    }  
      
    public static byte[] intToByteArray(int a) {  
        return new byte[] {  
            (byte) ((a >> 24) & 0xFF),  
            (byte) ((a >> 16) & 0xFF),     
            (byte) ((a >> 8) & 0xFF),     
            (byte) (a & 0xFF)  
        };  
    }  
	
	
}