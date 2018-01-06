package com.vijay.util;

/**
 * 
 * @author vijay
 *
 */
public final class Print {

	@Deprecated
	private Print() {
	}

	public static void print(final String msg) {
		System.out.println(msg);
	}

	public static void printError(final String msg) {
		System.err.println(msg);
	}

}
