package org.usfirst.frc.team1803.robot.subsystems;

import edu.wpi.first.wpilibj.ADXRS450_Gyro;
import edu.wpi.first.wpilibj.DriverStation;
//import edu.wpi.first.wpilibj.AnalogGyro;
import edu.wpi.first.wpilibj.SPI.Port;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class GyroscopeSubsystem extends Subsystem {

    ADXRS450_Gyro gyro;

    
    public void initDefaultCommand() {
    	
    	gyro = new ADXRS450_Gyro(Port.kOnboardCS0);

    	if (gyro == null) return;
    	//gyro = new AnalogGyro(0);
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    	gyro.calibrate();
    	DriverStation.reportWarning("Gyro calibrated.", false);
    }
    
    public double getAngle()
    {
    	return gyro.getAngle();
    }
}

