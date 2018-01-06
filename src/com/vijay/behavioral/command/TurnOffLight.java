package com.vijay.behavioral.command;

/**
 * <p>
 * This is called concrete command.
 * </p>
 * 
 * @author vijay
 *
 */
public class TurnOffLight implements Command {

	private final Light light;

	public TurnOffLight(final Light light) {
		this.light = light;
	}

	@Override
	public void execute() {
		light.flipDown();
	}
}
