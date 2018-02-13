package org.usfirst.frc.team1803.robot.commands;

import org.usfirst.frc.team1803.robot.OI;
import org.usfirst.frc.team1803.robot.Robot;
import edu.wpi.first.wpilibj.GenericHID.Hand;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class DriveCommand extends Command {

	XboxController controller = OI.controller;
	
	double[] speedVal = new double[2];
	
    public DriveCommand() {
    	requires(Robot.drivetrainSubsystem);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	
    	speedVal[0] = -controller.getY(Hand.kLeft);
    	speedVal[1] = controller.getX(Hand.kLeft);
    	if (!controller.getBumper(Hand.kRight))
    	{
    		speedVal[0] *= 0.5;
    		speedVal[1] *= 0.5;
    	}
    	Robot.drivetrainSubsystem.Drive(speedVal[0], speedVal[1]);
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
