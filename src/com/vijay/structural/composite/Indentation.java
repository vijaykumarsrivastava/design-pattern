package com.vijay.structural.composite;

/**
 * 
 * @author vijay
 *
 */
public class Indentation {

	private final StringBuffer buffer = new StringBuffer();

	public void increase() {
		buffer.append("   ").toString();
	}

	public String getIndentation() {
		return buffer.toString();
	}

	public void decrease() {
		buffer.setLength(buffer.length() - 3);
	}

}
