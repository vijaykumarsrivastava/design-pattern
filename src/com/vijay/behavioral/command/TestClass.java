package com.vijay.behavioral.command;

/**
 * <p>
 * This client.
 * </p>
 * <b>Problem</b>
 * <p>
 * Need to issue requests to objects without knowing anything about the
 * operation being requested or the receiver of the request.
 * <p>
 * 
 * @author vijay
 *
 */
public class TestClass {

	public static void main(String[] args) {
		final Light light = new Light();
		final Command turnOff = new TurnOffLight(light);
		final Command turnOn = new TurnOnLight(light);
		Switch s = new Switch(turnOff, turnOn);
		s.flipUp();
		s.flipDown();
	}
}
