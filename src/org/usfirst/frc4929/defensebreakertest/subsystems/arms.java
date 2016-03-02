package org.usfirst.frc4929.defensebreakertest.subsystems;

import org.usfirst.frc4929.defensebreakertest.Robot;
import org.usfirst.frc4929.defensebreakertest.RobotMap;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.Subsystem;

public class arms extends Subsystem {
    
	 SpeedController armMotor = RobotMap.armMotor;
	
	public void initDefaultCommand(){
	
	}
	
	public void liftShooter() {
    	this.armMotor.set(Robot.armLiftSpeed);
    }
    
    public void lowerShooter() {
    	this.armMotor.set(-Robot.armLiftSpeed);
    }

	public void stopShooterLift() {
		
		this.armMotor.set(0);
	}

}
