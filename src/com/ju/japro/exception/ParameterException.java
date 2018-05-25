package com.ju.japro.exception;

public class ParameterException extends Exception {
	private static final long serialVersionUID = 1L;
	private int code;
	public ParameterException(String message) {
		super(message);
	}
	
	public ParameterException(int code) {
		this.code = code;
	}
	
	public ParameterException(int code,String message) {
		super(message);
		this.code = code;
	}
	public String toString() {
		return "code = " + code + ", message = " + super.getMessage();
	}
}