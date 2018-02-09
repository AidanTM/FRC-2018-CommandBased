package org.usfirst.frc.team1803.robot.subsystems;

import org.usfirst.frc.team1803.robot.RobotMap;
import org.usfirst.frc.team1803.robot.commands.DriveCommand;

import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;


/**
 *
 */
public class DrivetrainSubsystem extends Subsystem {

	Talon leftFront;
	Talon leftBack;
	Talon rightFront;
	Talon rightBack;
	
	SpeedControllerGroup left;
	SpeedControllerGroup right;
	DifferentialDrive drivetrain;
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    	leftFront = RobotMap.leftFrontDrivetrainMotor;
    	leftBack = RobotMap.leftBackDrivetrainMotor;
    	rightFront = RobotMap.rightFrontDrivetrainMotor;
    	rightBack = RobotMap.rightBackDrivetrainMotor;
    	
    	left = new SpeedControllerGroup(leftFront, leftBack);
    	right = new SpeedControllerGroup(rightFront, rightBack);
    	
    	drivetrain = new DifferentialDrive(left, right);
    	
    	leftFront.setSafetyEnabled(false);
    	leftBack.setSafetyEnabled(false);
    	rightFront.setSafetyEnabled(false);
    	rightBack.setSafetyEnabled(false);
    	
    	setDefaultCommand(new DriveCommand());
    }
    
    public void Drive(double y, double x) {
    	drivetrain.arcadeDrive(y, x);
    }
}

