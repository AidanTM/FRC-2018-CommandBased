package org.usfirst.frc.team1803.robot.commands;

import org.usfirst.frc.team1803.robot.OI;
import org.usfirst.frc.team1803.robot.Robot;

import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.GenericHID.Hand;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class DriveCommand extends Command {

	Joystick controller = OI.controller;
	
    public DriveCommand() {
    	requires(Robot.drivetrainSubsystem);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	DriverStation.reportError("tet", false);
    	Robot.drivetrainSubsystem.Drive(controller.getRawAxis(1), controller.getX(Hand.kLeft));
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
