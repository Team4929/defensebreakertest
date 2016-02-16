// RobotBuilder Version: 1.5
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc4929.defensebreakertest.subsystems;

import org.usfirst.frc4929.defensebreakertest.Robot;
import org.usfirst.frc4929.defensebreakertest.RobotMap;

import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.command.Subsystem;


/**
 *
 */
public class ShooterLift extends Subsystem {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    SpeedController liftmotor = RobotMap.shooterLiftliftmotor;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    // limits for Pot1
    public static double upperLimit = -118.00d;
    public static double lowerLimit = -134.00d;
    
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND
	
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void liftShooter() {
    	this.liftmotor.set(Robot.liftSpeed);
    }
    
    public void lowerShooter() {
    	this.liftmotor.set(-Robot.liftSpeed);
    }

	public void stopShooterLift() {
		
		this.liftmotor.set(0);
	}

	public double currentPosition() {
		return RobotMap.shooterLiftliftmotorPot1.get();
	}
}	


