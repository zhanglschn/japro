package com.ju.japro.structalg.abstracts;

import com.ju.japro.exceptions.DisException;
import com.ju.japro.structalg.abstracts.dto.ChannelConsumeReq;

public class BaseClsApp {
	public static void main(String[] args) throws DisException {
		ConsumeMsgHandler consumeMsgHandler = new ConsumeMsgHandler();
		consumeMsgHandler.setServiceReqObject(setReq());
		
		consumeMsgHandler.encodeHttpRequestReq();
		consumeMsgHandler.encodeHttpResponseResp();
	}
	
	public static ChannelConsumeReq setReq() {
		ChannelConsumeReq req = new ChannelConsumeReq();
		req.setTerminalInfo("123456789");
		req.setTerminalCode("20048");
		req.setTxAmount(200);
		req.setCardNo("60012654899335548799");
		
		return req;
	}
}