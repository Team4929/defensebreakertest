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

import org.usfirst.frc4929.defensebreakertest.commands.*;
import org.usfirst.frc4929.defensebreakertest.controllers.XboxController;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;


/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    //// CREATING BUTTONS
    // One type of button is a joystick button which is any button on a joystick.
    // You create one by telling it which joystick it's on and which button
    // number it is.
    // Joystick stick = new Joystick(port);
    // Button button = new JoystickButton(stick, buttonNumber);
    
    // There are a few additional built in buttons you can use. Additionally,
    // by subclassing Button you can create custom triggers and bind those to
    // commands the same as any other Button.
    
    //// TRIGGERING COMMANDS WITH BUTTONS
    // Once you have a button, it's trivial to bind it to a button in one of
    // three ways:
    
    // Start the command when the button is pressed and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenPressed(new ExampleCommand());
    
    // Run the command while the button is being held down and interrupt it once
    // the button is released.
    // button.whileHeld(new ExampleCommand());
    
    // Start the command when the button is released  and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenReleased(new ExampleCommand());

    
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
	public XboxController xBoxController;
	
	
    public OI() {
    	
    	
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS


	    
        // SmartDashboard Buttons
        SmartDashboard.putData("Autonomous Command", new AutonomousCommand());

        SmartDashboard.putData("Gatherboulder", new Gatherboulders());

        SmartDashboard.putData("Shoot", new Shoot());

        SmartDashboard.putData("Lift Shooter", new LiftShooter());

        SmartDashboard.putData("Lower Shooter", new LowerShooter());
        
        SmartDashboard.putNumber("Potentiometer1", RobotMap.shooterLiftliftmotorPot1.get());
        SmartDashboard.putNumber("Potentiometer2", RobotMap.shooterLiftliftmotorPot2.get());
        		 
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
         xBoxController = new XboxController(1);
         
         xBoxController.getLTriggerButtonRef().whileHeld(new LowerShooter());
         xBoxController.getRTriggerButtonRef().whileHeld(new LiftShooter());
         xBoxController.getBButtonRef().whileHeld(new Gatherboulders());
         xBoxController.getAButtonRef().whileHeld(new Shoot());
         //xBoxController.getXButtonRef().whileHeld(new Kicker());
         
        
    }


	public XboxController getXBoxController() {
		return xBoxController;
	}


	public void setXBoxController(XboxController xBoxController) {
		this.xBoxController = xBoxController;
	}
    
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
}
