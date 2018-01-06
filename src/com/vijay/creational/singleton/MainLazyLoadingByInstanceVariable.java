package com.vijay.creational.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import com.vijay.util.Logger;

/**
 * Testing {@link LazyLoadingByInstanceVariable} class.
 * 
 * @author vijay
 *
 */
public class MainLazyLoadingByInstanceVariable {

	public static void main(String[] args) {
		LazyLoadingByInstanceVariable.getInstance();
		// Test for reflection.
		try {
			reflectionTest();
		} catch (IllegalStateException e) {
			Logger.info("Reflection test is successfully completed.");
		}

	}

	private static void reflectionTest() {
		try {
			final Constructor<LazyLoadingByInstanceVariable> constructor = LazyLoadingByInstanceVariable.class
					.getDeclaredConstructor();
			constructor.setAccessible(true);
			constructor.newInstance();
		} catch (NoSuchMethodException | SecurityException | InstantiationException | IllegalAccessException
				| IllegalArgumentException | InvocationTargetException e) {
			if (e.getCause() instanceof IllegalStateException) {
				throw (IllegalStateException) e.getCause();
			}
			Logger.error(e);
		}
	}
}
