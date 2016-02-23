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
public class BoulderShooter extends Subsystem {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    SpeedController bouldershootermotor = RobotMap.boulderGrabbershootermotor;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATION
    
    Relay kickerRelay = RobotMap.shooterLiftKicker;
   
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND
        //setDefaultCommand(new shoot1());

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND
	
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void startShooter() {
	    this.bouldershootermotor.set(-Robot.shootSpeed);
    }
    
    public void stopShooter() {
    	this.bouldershootermotor.set(0);
    }
    
	public void kick(){
		this.kickerRelay.set(Relay.Value.kReverse);
	}  
	
	public void stopKick(){
		this.kickerRelay.set(Relay.Value.kOff);
	}	

}

