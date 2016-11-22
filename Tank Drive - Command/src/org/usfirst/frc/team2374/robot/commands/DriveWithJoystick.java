package org.usfirst.frc.team2374.robot.commands;

import org.usfirst.frc.team2374.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 * Use the joystick to drive the robot in TankDrive. Always runs until interrupted
 * by another command.
 */

public class DriveWithJoystick extends Command {

	
	public DriveWithJoystick() {
		requires(Robot.drivetrain);
	}
	
	@Override
	protected void initialize() {
		
	}

	@Override
	protected void execute() {
		Robot.drivetrain.tankDrive(Robot.oi.getJoystick());
	}

	@Override
	protected boolean isFinished() {
		return false; // runs until interrupted
	}

	@Override
	protected void end() {
		Robot.drivetrain.tankDrive(0, 0);
	}

	@Override
	protected void interrupted() {
		end();
	}

}
