// RobotBuilder Version: 1.5
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc4929.defensebreakertest;
    
import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;



/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static SpeedController drivetrainLeftFront;
    public static SpeedController drivetrainRightFront;
    public static SpeedController drivetrainLeftRear;
    public static SpeedController drivetrainRightRear;
    public static RobotDrive drivetrainRobotDrive41;
    public static DigitalInput boulderGrabberLimitSwitch1;
    public static SpeedController boulderGrabbershootermotor;
    public static SpeedController shooterLiftliftmotor;
    public static AnalogPotentiometer shooterLiftliftmotorPot1;
    public static AnalogPotentiometer shooterLiftliftmotorPot2;
    public static Relay shooterLiftKicker;
 

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    
    public static void init() {
    	
    	shooterLiftliftmotorPot1 = new AnalogPotentiometer(2, 270, -135);
    	shooterLiftliftmotorPot2 = new AnalogPotentiometer(3, 270, -135);
    	
    	shooterLiftKicker = new Relay(0);

    	
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    	
        drivetrainLeftFront = new Victor(2);
        LiveWindow.addActuator("drive train", "Left Front", (Victor) drivetrainLeftFront);

        drivetrainLeftRear = new Victor(3);
        LiveWindow.addActuator("drive train", "Left Rear", (Victor) drivetrainLeftRear);        
        
        drivetrainRightFront = new Victor(0);
        LiveWindow.addActuator("drive train", "Right Front", (Victor) drivetrainRightFront);    
        
        drivetrainRightRear = new Victor(1);
        LiveWindow.addActuator("drive train", "Right Rear", (Victor) drivetrainRightRear);
    	
       /*
        drivetrainLeftFront = new Jaguar(0);
        LiveWindow.addActuator("drive train", "Left Front", (Jaguar) drivetrainLeftFront);

        drivetrainLeftRear = new Jaguar(1);
        LiveWindow.addActuator("drive train", "Left Rear", (Jaguar) drivetrainLeftRear);        
        
        drivetrainRightFront = new Jaguar(2);
        LiveWindow.addActuator("drive train", "Right Front", (Jaguar) drivetrainRightFront);    
        
        drivetrainRightRear = new Jaguar(3);
        LiveWindow.addActuator("drive train", "Right Rear", (Jaguar) drivetrainRightRear);
        */
        
        LiveWindow.addSensor("shooter lift", "potentiometer1", shooterLiftliftmotorPot1);
        LiveWindow.addSensor("shooter lift", "potentiometer2", shooterLiftliftmotorPot2);
      
        drivetrainRobotDrive41 = new RobotDrive(drivetrainLeftFront, drivetrainLeftRear,
              drivetrainRightFront, drivetrainRightRear);
        
        drivetrainRobotDrive41.setSafetyEnabled(true);
        drivetrainRobotDrive41.setExpiration(0.1);
        drivetrainRobotDrive41.setSensitivity(0.5);
        drivetrainRobotDrive41.setMaxOutput(1.5);
        
        boulderGrabberLimitSwitch1 = new DigitalInput(0);
        LiveWindow.addSensor("Boulder Grabber", "Limit Switch 1", boulderGrabberLimitSwitch1);
        
        boulderGrabbershootermotor = new Victor(7);
        LiveWindow.addActuator("Boulder Grabber", "left shooter motor", (Victor) boulderGrabbershootermotor);
        
        shooterLiftliftmotor = new Victor(5);
        LiveWindow.addActuator("Shooter Lift", "lift motor", (Victor) shooterLiftliftmotor);
        
 

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }
}