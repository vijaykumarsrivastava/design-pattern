package com.vijay.creational.singleton;

import com.vijay.util.Print;

/**
 * This eager loading singleton class.
 * 
 * @author vijay
 *
 */
public class EagerLoadingSingleton {

	private static final EagerLoadingSingleton singletonType1 = new EagerLoadingSingleton();

	@Deprecated
	private EagerLoadingSingleton() {
		if (singletonType1 != null) {
			Print.print("Can't construct object because one instance is already there.");
			throw new IllegalStateException();
		}
		Print.print("Object constructed.");
	}

	public static EagerLoadingSingleton getInstance() {
		Print.print("Retrieve instance.");
		return singletonType1;
	}

	// do other stuff
}
