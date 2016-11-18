package org.usfirst.frc.team2374.robot.commands;

import org.usfirst.frc.team2374.robot.Robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.command.Command;

public class TurretCommand extends Command {
	
	private static Joystick joy;
	private static int speed;//Rate of rotation, TBD
	
	public TurretCommand() {
		requires(Robot.turret);
	}

	@Override
	protected void initialize() {

	}

	@Override
	protected void execute() {
		if (joy.getRawButton(5)) Robot.turret.setSpeed(speed);//Change buttons later
		if (joy.getRawButton(6)) Robot.turret.setSpeed(-speed);//Change buttons later
	}

	@Override
	protected boolean isFinished() {
		return false; // runs until interrupted
	}

	@Override
	protected void end() {
		Robot.turret.setSpeed(0);
	}

	@Override
	protected void interrupted() {
		end();
	}

}
