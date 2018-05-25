package com.ju.japro.test;

import java.util.HashMap;
import java.util.Map;

import com.alibaba.fastjson.JSONObject;

class ResultDto {
	int code;
	String ret;
	Map<String,KeyV> data;
	
	public Map<String, KeyV> getData() {
		return data;
	}
	public void setData(Map<String, KeyV> data) {
		this.data = data;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getRet() {
		return ret;
	}
	public void setRet(String ret) {
		this.ret = ret;
	}
}
class KeyV {
	String value;
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
}
public class JsonTest {
	public static void main(String[] args) {
		ResultDto dt = new ResultDto();
		dt.setCode(1);
		dt.setRet("1");
		
		Map<String,KeyV> values = new HashMap<String,KeyV>();
		KeyV keyv1 = new KeyV();
		keyv1.setValue("1111");
		
		KeyV keyv2 = new KeyV();
		keyv2.setValue("2222");
		
		
		values.put("key1", keyv1);
		values.put("key2", keyv2);
		dt.setData(values);
		
		Object obj = JSONObject.toJSON(dt);
		System.out.println(obj.toString());
	}
}