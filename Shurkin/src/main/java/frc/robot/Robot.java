// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;

import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.XboxController;



public class Robot extends TimedRobot {

  // drive
  WPI_TalonFX RightDriveTalon;
  WPI_TalonFX LeftDriveTalon;
  // shooter
  WPI_TalonFX LeftShooter;
  WPI_TalonFX RightShooter;
  //funnels
  WPI_TalonFX FunnelLeft;
  WPI_TalonFX FunnelRight;
  // controller
  XboxController controller;



  // doubles & booleans
  double rightSide;
  double leftSide;
  boolean buttonAIsPressed = false;
  


  
  @Override
  public void robotInit() {
    
    RightDriveTalon = new WPI_TalonFX(1);
    LeftDriveTalon = new WPI_TalonFX(2);

    LeftShooter = new WPI_Talon(3);
    RightShooter = new WPI_Talon(4);
    
    FunnelLeft = new WPI_TalonFX(5);
    FunnelRight = new WPI_TalonFX(6);

    controller  = new XboxController(0);
    



    
  }

  
  @Override
  public void robotPeriodic() {}

  
  @Override
  public void autonomousInit() {
    
  }

  
  @Override
  public void autonomousPeriodic() {
    
    }
  

  
  @Override
  public void teleopInit() {}
  
  
  @Override
  public void teleopPeriodic() {

    if (m_controller.getTriggerAxis(Hand.kLeft) > 0.1) {
      LeftShooter.set(ControlMode.PercentOutput, 0.7);

    







    // drive train
    rightSide = (-controller.getRawAxis(4) + controller.getRawAxis(1));
    leftSide = (-controller.getRawAxis(4) - controller.getRawAxis(1));

    // Setting motor with double
    RightDriveTalon.set(ControlMode.PercentOutput, -rightSide);
    LeftDriveTalon.set(ControlMode.PercentOutput, -leftSide);

  }
  

  




  }

}

