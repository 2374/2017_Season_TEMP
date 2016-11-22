package org.usfirst.frc.team2374.robot.subsystems;

import org.usfirst.frc.team2374.robot.RobotMap;
import org.usfirst.frc.team2374.robot.commands.DriveWithJoystick;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

public class DriveTrain extends Subsystem {
	
	private SpeedController frontLeftMotor, backLeftMotor,
		frontRightMotor, backRightMotor;
	private RobotDrive drive;
	
	public DriveTrain() {
		super();
		
		// configures drive motors
		frontLeftMotor = new Victor(RobotMap.frontLeftMotor);
		backLeftMotor = new Victor(RobotMap.backLeftMotor);
		frontRightMotor = new Victor(RobotMap.frontRightMotor);
		backRightMotor = new Victor(RobotMap.backRightMotor);
		LiveWindow.addActuator("DriveTrain", "Front Left Motor", (Victor) frontLeftMotor);
		LiveWindow.addActuator("DriveTrain", "Back Left Motor", (Victor) backLeftMotor);
		LiveWindow.addActuator("DriveTrain", "Front Right Motor", (Victor) frontRightMotor);
		LiveWindow.addActuator("DriveTrain", "Back Right Motor", (Victor) backRightMotor);
		
		// configures TankDrive
		drive = new RobotDrive(frontLeftMotor, backLeftMotor, frontRightMotor, backRightMotor);
		drive.setSafetyEnabled(true);
	}
	
	@Override
	public void initDefaultCommand() {
		setDefaultCommand(new DriveWithJoystick());
	}
	
	public void tankDrive(Joystick joy) {
		drive.tankDrive(joy.getRawAxis(RobotMap.joyAxisLeft), joy.getRawAxis(RobotMap.joyAxisRight));
	}
	
	public void tankDrive(double leftValue, double rightValue) {
		drive.tankDrive(leftValue, rightValue);
	}

}
