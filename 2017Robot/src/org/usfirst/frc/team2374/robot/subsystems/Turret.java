package org.usfirst.frc.team2374.robot.subsystems;

import org.usfirst.frc.team2374.robot.commands.TurretCommand;

import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Turret extends Subsystem {

	private SpeedController motor;

	public Turret(int port) {
	    motor = new Talon(port);
		}

	    public void setSpeed(double speed) {motor.set(speed);}

		@Override
		protected void initDefaultCommand() {
			setDefaultCommand(new TurretCommand());
		}
		
	
}

