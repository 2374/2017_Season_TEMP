package org.usfirst.frc.team2374.robot;

import edu.wpi.first.wpilibj.Joystick;

public class Controllers {

	/*
	 * This class gives the axis and button values of a controller
	 */

	// "Razer Sabertooth Elite (Controller)"
	private static int rAxisLeftX = 0;
	private static int rAxisLeftY = 1;
	private static int rAxisRightX = 4;
	private static int rAxisRightY = 5;

	// "Logitech Dual Action"
	private static int lAxisLeftX = 0;
	private static int lAxisLeftY = 1;
	private static int lAxisRightX = 2;
	private static int lAxisRightY = 3;

	public static int getAxisLeftX(Joystick joy) {
		if (joy.getName().equals("Razer Sabertooth Elite (Controller)"))
			return rAxisLeftX;
		else
			return lAxisLeftX;
	}

	public static int getAxisLeftY(Joystick joy) {
		if (joy.getName().equals("Razer Sabertooth Elite (Controller)"))
			return rAxisLeftY;
		else
			return lAxisLeftY;
	}

	public static int getAxisRightX(Joystick joy) {
		if (joy.getName().equals("Razer Sabertooth Elite (Controller)"))
			return rAxisRightX;
		else
			return lAxisRightX;
	}

	public static int getAxixRightY(Joystick joy) {
		if (joy.getName().equals("Razer Sabertooth Elite (Controller)"))
			return rAxisRightY;
		else
			return lAxisRightY;
	}

}
