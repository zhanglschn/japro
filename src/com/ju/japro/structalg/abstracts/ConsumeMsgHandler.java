package com.ju.japro.structalg.abstracts;

import java.lang.reflect.Field;
import java.util.Map;

import net.sf.json.JSONObject;

import com.ju.japro.exceptions.DisException;
import com.ju.japro.structalg.abstracts.dto.ChannelConsumeReq;
import com.ju.japro.structalg.abstracts.dto.ChannelConsumeResp;

public class ConsumeMsgHandler extends BaseCls<ChannelConsumeReq, ChannelConsumeResp> {

	public Map<String, String> encodeReqToMap(ChannelConsumeReq req) throws DisException {

		Map<String, String> reqMap = JSONObject.fromObject(req);
		if (reqMap.isEmpty()) {
			return null;
		}
		
		return reqMap;
	}

	public ChannelConsumeResp decodeRespToResp(Map<String, Object> resp) throws DisException {
		ChannelConsumeResp channelConsumeResp = new ChannelConsumeResp();

		try {
			Field[] fields = channelConsumeResp.getClass().getDeclaredFields();
			for (int i = 0; i < fields.length; i++) {
				Field field = fields[i];
				String name = fields[i].getName();
				Object val = resp.get(name);
				field.setAccessible(true);
				field.set(channelConsumeResp, val);
			}
		} catch (Exception e) {
			throw new DisException();
		}
		return channelConsumeResp;
	}
}