package com.ju.japro.structalg.twelve.exceptions;

import java.io.FileNotFoundException;
import java.io.IOException;

import static com.ju.japro.common.util.Print.print;

class WrapCheckedException {
	void throwRuntimeException(int type) {
		try {
			switch (type) {
			case 0:
				throw new FileNotFoundException();
			case 1:
				throw new IOException();
			case 2:
				throw new RuntimeException("Where am I? ");
			default:
				return;
			}
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
}
@SuppressWarnings("all")
class SomeOtherException extends Exception {}

public class TurnOffChecking {
	public static void main(String[] args) {
		WrapCheckedException wce = new WrapCheckedException();
		wce.throwRuntimeException(3);
		for (int i = 0; i < 4; i++) {
			try {
				if (i < 3)
					wce.throwRuntimeException(i);
				else
					throw new SomeOtherException();
			} catch (SomeOtherException e) {
				print("SomeOtherException: " + e);
			} catch (RuntimeException re) {
				try {
					throw re.getCause();
				} catch (FileNotFoundException e) {
					print("FileNotFoundException: " + e);
				} catch (IOException e) {
					print("IOException: " + e);
				} catch (Throwable e) {
					print("Throwable: " + e);
				}
			}
		}
	}
}