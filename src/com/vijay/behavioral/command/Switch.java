package com.vijay.behavioral.command;

/**
 * <p>
 * This is invoker.
 * </p>
 * 
 * @author vijay
 *
 */
public class Switch {

	private final Command turnOff;
	private final Command turnOn;

	public Switch(final Command turnOff, final Command turnOn) {
		this.turnOff = turnOff;
		this.turnOn = turnOn;
	}

	public void flipUp() {
		turnOn.execute();
	}

	public void flipDown() {
		turnOff.execute();
	}
}
