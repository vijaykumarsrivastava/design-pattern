package com.vijay.creational.singleton;

import com.vijay.util.Print;

/**
 * 
 * @author vijay
 *
 */
public class LazyLoadingNestedClass {

	private LazyLoadingNestedClass() {
		if(getInstance() != null) {
			Print.print("Can't construct LazyLoadingNestedClass's object.");
			throw new IllegalStateException();
		}
		Print.print("Constructed LazyLoadingNestedClass object.");
	}

	public static LazyLoadingNestedClass getInstance() {
		return NestedClass.lazyLoading;
	}
	
	private static class NestedClass {
		static final LazyLoadingNestedClass lazyLoading = new LazyLoadingNestedClass();
		// do other stuff.
	}
}
