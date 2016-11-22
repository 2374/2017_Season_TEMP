package org.usfirst.frc.team2374.robot.subsystems;

import org.usfirst.frc.team2374.robot.commands.DriveWithJoystick;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

public class DriveTrain extends Subsystem {

	private SpeedController frontLeftMotor, backLeftMotor, frontRightMotor,
			backRightMotor;
	private RobotDrive drive;

	public DriveTrain() {
		super();
		
		// 0 = rear left
		// 1 = rear right
		
		// configures drive motors
		frontLeftMotor = new Victor(2);
		backLeftMotor = new Victor(0);
		frontRightMotor = new Victor(3);
		backRightMotor = new Victor(1);
		LiveWindow.addActuator("DriveTrain", "Front Left Motor",
				(Victor) frontLeftMotor);
		LiveWindow.addActuator("DriveTrain", "Back Left Motor",
				(Victor) backLeftMotor);
		LiveWindow.addActuator("DriveTrain", "Front Right Motor",
				(Victor) frontRightMotor);
		LiveWindow.addActuator("DriveTrain", "Back Right Motor",
				(Victor) backRightMotor);

		// configures TankDrive
		drive = new RobotDrive(frontLeftMotor, backLeftMotor, frontRightMotor,
				backRightMotor);
		drive.setSafetyEnabled(true);
		drive.setInvertedMotor(RobotDrive.MotorType.kFrontLeft, true);
		drive.setInvertedMotor(RobotDrive.MotorType.kRearLeft, true);
		drive.setInvertedMotor(RobotDrive.MotorType.kFrontRight, true);
		drive.setInvertedMotor(RobotDrive.MotorType.kRearRight, true);
	}

	@Override
	public void initDefaultCommand() {
		setDefaultCommand(new DriveWithJoystick());
	}

	public void mecanumDrive(Joystick joy) {
		drive.mecanumDrive_Cartesian(joy.getRawAxis(0), joy.getRawAxis(2),
				joy.getRawAxis(1), 0);
	}

	public void mecanumDrive(double x, double y, double rotation) {
		drive.mecanumDrive_Cartesian(x, y, rotation, 0);
		;
	}

}
