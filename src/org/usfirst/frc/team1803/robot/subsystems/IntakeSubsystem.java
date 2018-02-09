package org.usfirst.frc.team1803.robot.subsystems;

import org.usfirst.frc.team1803.robot.commands.IntakeCommand;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

/**
 *
 */
public class IntakeSubsystem extends Subsystem {

	Talon leftMotor;
	Talon rightMotor;
	
	DifferentialDrive motorGroup;
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
    	
    	leftMotor = new Talon(5);
    	rightMotor = new Talon(6);
    	motorGroup = new DifferentialDrive(leftMotor, rightMotor);
    	
    	leftMotor.setSafetyEnabled(false);
    	rightMotor.setSafetyEnabled(false);
    	
        // Set the default command for a subsystem here.
        setDefaultCommand(new IntakeCommand());
    }
    
    public void intakeSpeed(double speed)
    {
    	motorGroup.arcadeDrive(speed, 0);
    	
    }
}

