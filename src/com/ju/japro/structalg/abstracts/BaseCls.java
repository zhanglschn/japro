package com.ju.japro.structalg.abstracts;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import com.alibaba.fastjson.JSONObject;
import com.ju.japro.common.util.Print;
import com.ju.japro.exceptions.DisException;

public abstract class BaseCls<REQ extends Object, RES extends Object> {
	protected REQ serviceReqObject;
	protected Map<String, Object> resultMap;

	protected Map<String, Object> setResultMap() {
		resultMap = new HashMap<String, Object>();

		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");

		resultMap.put("terminalCode", "1010254789");
		resultMap.put("txAmount", new Random().nextInt(20));
		resultMap.put("clearingDate", sdf.format(new Date()));
		resultMap.put("authorizeNo", "20171110265463");
		resultMap.put("icCardData", "DYJNCDHG20171110");

		return resultMap;
	}

	public REQ getServiceReqObject() {
		return this.serviceReqObject;
	}

	public void setServiceReqObject(REQ req) {
		this.serviceReqObject = req;
	}

	public abstract Map<String, String> encodeReqToMap(REQ req) throws DisException;

	public abstract RES decodeRespToResp(Map<String, Object> resp) throws DisException;

	public void encodeHttpRequestReq() throws DisException {
		REQ req = (REQ) this.getServiceReqObject();

		Map<String, String> reqMap = encodeReqToMap(req);

		Print.print(JSONObject.toJSONString(reqMap));
	}

	public RES encodeHttpResponseResp() throws DisException {
		Map<String, Object> resultMap = setResultMap();

		RES res = decodeRespToResp(resultMap);
		
		Print.print(JSONObject.toJSONString(res));
		return res;
	}
}