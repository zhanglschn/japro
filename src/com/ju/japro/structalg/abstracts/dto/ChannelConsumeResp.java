package com.ju.japro.structalg.abstracts.dto;

public class ChannelConsumeResp {
	public String terminalCode;
	public long txAmount;
	public String clearingDate;
	public String authorizeNo;
	public String icCardData;

	public String getTerminalCode() {
		return terminalCode;
	}

	public void setTerminalCode(String _terminalCode) {
		terminalCode = _terminalCode;
	}

	public long getTxAmount() {
		return txAmount;
	}

	public void setTxAmount(long _txAmount) {
		txAmount = _txAmount;
	}

	public String getClearingDate() {
		return clearingDate;
	}

	public void setClearingDate(String _clearingDate) {
		clearingDate = _clearingDate;
	}

	public String getAuthorizeNo() {
		return authorizeNo;
	}

	public void setAuthorizeNo(String _authorizeNo) {
		authorizeNo = _authorizeNo;
	}

	public String getIcCardData() {
		return icCardData;
	}

	public void setIcCardData(String _icCardData) {
		icCardData = _icCardData;
	}
}