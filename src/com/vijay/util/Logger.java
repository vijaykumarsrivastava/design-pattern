package com.vijay.util;

/**
 * 
 * @author vijay
 *
 */
public final class Logger {

	@Deprecated
	private Logger() {
	}

	public static void info(final String msg) {
		System.out.println(msg);
	}

	public static void error(final String msg) {
		System.err.println(msg);
	}

	public static void info(final Throwable throwable) {
		System.out.println(throwable);
	}

	public static void error(final Throwable throwable) {
		System.err.println(throwable);
	}
}
