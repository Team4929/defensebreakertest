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
public class BoulderGrabber extends Subsystem {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    DigitalInput limitSwitch1 = RobotMap.boulderGrabberLimitSwitch1;
    SpeedController leftshootermotor = RobotMap.boulderGrabberleftshootermotor;
    SpeedController rightshootermotor = RobotMap.boulderGrabberrightshootermotor;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND
        //setDefaultCommand(new gatherboulders1());

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND
	
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public DigitalInput getLimitSwitch() {
    	return this.limitSwitch1;
    }
    
    public void gatherBoulder() {
    	this.leftshootermotor.set(Robot.gatherSpeed);
    	this.rightshootermotor.set(-Robot.gatherSpeed);
    }
}

