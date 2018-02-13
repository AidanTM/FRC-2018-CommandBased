package org.usfirst.frc.team1803.robot.subsystems;

import org.usfirst.frc.team1803.robot.RobotMap;
import org.usfirst.frc.team1803.robot.commands.BucketCommand;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class BucketSubsystem extends Subsystem {

    Talon bucketMotor;

    public void initDefaultCommand() {
    	bucketMotor = RobotMap.bucketMotor;
    	bucketMotor.setSafetyEnabled(false);
        setDefaultCommand(new BucketCommand());
    }
    
    public void setBucketSpeed(double speed)
    {
    	bucketMotor.set(-speed);
    }
}

