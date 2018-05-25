package com.ju.japro.exceptions;

public class DisException extends UserException{
	private static final long serialVersionUID = 314152698756L;
	
	public int errorCode;
	public String errorMsg;
	
	public DisException() {
		this.errorMsg = "";
	}
	
	public DisException(Throwable __cause) {
		super(__cause);
		this.errorMsg = "";
	}
	
	public DisException(int errorCode,String errorMsg) {
		this.errorCode = errorCode;
		this.errorMsg = errorMsg;
	}
	
	public DisException(int errorCode,String errorMsg,Throwable __cause) {
		super(__cause);
		this.errorCode = errorCode;
		this.errorMsg = errorMsg;
	}
	
}