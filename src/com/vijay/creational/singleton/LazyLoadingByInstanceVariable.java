package com.vijay.creational.singleton;

import com.vijay.util.Print;

/**
 * 
 * @author vijay
 *
 */
public class LazyLoadingByInstanceVariable {

	private static LazyLoadingByInstanceVariable lazyLoadingByInstanceVariable;

	private LazyLoadingByInstanceVariable() {
		synchronized (LazyLoadingByInstanceVariable.class) {
			if (lazyLoadingByInstanceVariable != null) {
				Print.print("Can't construct object because one instance is already there.");
				throw new IllegalStateException();
			}
		}
		Print.print("LazyLoadingByInstanceVariable constructed.");
	}

	public static LazyLoadingByInstanceVariable getInstance() {
		if (lazyLoadingByInstanceVariable == null) {
			synchronized (LazyLoadingByInstanceVariable.class) {
				if (lazyLoadingByInstanceVariable == null) {
					lazyLoadingByInstanceVariable = new LazyLoadingByInstanceVariable();
				}
			}
		}
		return lazyLoadingByInstanceVariable;
	}
}
