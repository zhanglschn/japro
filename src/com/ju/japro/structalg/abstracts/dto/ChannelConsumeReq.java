package com.ju.japro.structalg.abstracts.dto;

public class ChannelConsumeReq {

	public ChannelConsumeReq() {
		terminalCode = "";
		cardNo = "";
		cardSeqNo = "";
		serviceInputNo = "";
		terminalInfo = "";
	}

	public ChannelConsumeReq(String terminalCode, String cardNo, String cardSeqNo, String serviceInputNo, String terminalInfo) {
		this.terminalCode = terminalCode;
		this.cardNo = cardNo;
		this.cardSeqNo = cardSeqNo;
		this.serviceInputNo = serviceInputNo;
		this.terminalInfo = terminalInfo;
	}

	public String terminalCode;
	public String cardNo;
	public long txAmount;

	public String getTerminalCode() {
		return terminalCode;
	}

	public void setTerminalCode(String _terminalCode) {
		terminalCode = _terminalCode;
	}

	public String getCardNo() {
		return cardNo;
	}

	public void setCardNo(String _cardNo) {
		cardNo = _cardNo;
	}

	public long getTxAmount() {
		return txAmount;
	}

	public void setTxAmount(long _txAmount) {
		txAmount = _txAmount;
	}

	public String cardSeqNo;

	public String getCardSeqNo() {
		return cardSeqNo;
	}

	public void setCardSeqNo(String _cardSeqNo) {
		cardSeqNo = _cardSeqNo;
	}

	public String serviceInputNo;

	public String getServiceInputNo() {
		return serviceInputNo;
	}

	public void setServiceInputNo(String _serviceInputNo) {
		serviceInputNo = _serviceInputNo;
	}

	public String terminalInfo;

	public String getTerminalInfo() {
		return terminalInfo;
	}

	public void setTerminalInfo(String _terminalInfo) {
		terminalInfo = _terminalInfo;
	}
}