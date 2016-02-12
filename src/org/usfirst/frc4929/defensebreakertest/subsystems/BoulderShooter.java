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
    SpeedController leftshootermotor = RobotMap.boulderShooterleftshootermotor;
    SpeedController rightshootermotor = RobotMap.boulderShooterrightshootermotor;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    Timer localTimer;
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND
        //setDefaultCommand(new shoot1());

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND
	
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void shootBoulder() {
    	
    	try {
	    	localTimer = new Timer();
	    	localTimer.start();
	
	    	while (!isFinished()) {
	    		this.leftshootermotor.set(-Robot.shootSpeed);
	    		this.rightshootermotor.set(Robot.shootSpeed);
	    	}
    	} finally {
        	localTimer.stop();
    	}
    }
    
    private boolean isFinished() { 
    	double stopSeconds = new Double(3).doubleValue();
    	
    	if (localTimer.get() >= stopSeconds) {
    		return true;
    	} else {
    		return false;
    	}
    }
}
