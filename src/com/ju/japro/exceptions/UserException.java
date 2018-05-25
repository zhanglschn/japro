package com.ju.japro.exceptions;


public class UserException extends java.lang.Exception implements Cloneable {
	private static final long serialVersionUID = 1L;

	public UserException() {
	}

	public UserException(Throwable cause) {
		super(cause);
	}

	public UserException clone() {
		UserException c = null;

		try {
			c = (UserException) super.clone();
		} catch (CloneNotSupportedException ex) {
			assert false;
		}
		return c;
	}
}