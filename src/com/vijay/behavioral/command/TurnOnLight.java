package com.vijay.behavioral.command;

/**
 * <p>
 * This is called concrete command.
 * </p>
 * 
 * @author vijay
 *
 */
public class TurnOnLight implements Command {

	private final Light light;

	public TurnOnLight(final Light light) {
		this.light = light;
	}

	@Override
	public void execute() {
		light.flipUp();
	}

}
