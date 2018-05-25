package com.ju.japro.json;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

public class JsonObjectTest {
	public static void main(String[] args) {
		String resultData = "{\"busData\":{\"extInfo\":{\"retCode\":\"\",\"retMsg\":\"接入机构号和商户的落地机构不一致\",\"shopNo\":\"822290058120114\",\"userId\":\"\"},\"orderId\":\"d58fda4a-59b4-48ea-b7b3-ceb450aa0d69\",\"orderType\":\"OPEN_D0_RESPONSE\",\"status\":\"FAILURE\"},\"command\":\"TP\",\"msgId\":\"982006d3-e47c-4f30-9dc6-b4094e4df4b2\",\"retUrl\":\"http://test.eidpay.com:8900/lklAuditNotice/notify\"}";
		
		JSONObject jso=JSON.parseObject(resultData);//json字符串转换成jsonobject对象
		
		JSONObject busData = JSON.parseObject(jso.getString("busData"));
		
		JSONObject extInfo = JSON.parseObject(busData.getString("extInfo"));
		
		String status = busData.getString("status");
		
		String retCode = extInfo.getString("retCode");
		
		String retMsg = extInfo.getString("retMsg");
		
		System.out.println("status = " + status + ",retCode = " + retCode + ",retMsg = " + retMsg);
	}
}