package com.vijay.creational.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import com.vijay.util.Logger;

/**
 * 
 * Testing {@link LazyLoadingNestedClass} class.
 * @author vijay
 *
 */
public class MainLazyLoadingNestedClass {

	public static void main(String[] args) {
		LazyLoadingNestedClass.getInstance();
		// Test for reflection.
		try {
			reflectionTest();
		} catch (IllegalStateException e) {
			Logger.info("Reflection test is successfully completed.");
		}

	}

	private static void reflectionTest() {
		try {
			final Constructor<LazyLoadingNestedClass> constructor = LazyLoadingNestedClass.class.getDeclaredConstructor();
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
