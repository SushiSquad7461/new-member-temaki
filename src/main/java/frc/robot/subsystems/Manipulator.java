// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMax.IdleMode;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Manipulator extends SubsystemBase {
  private final CANSparkMax motor;
  /** Creates a new Manipulator. */
  public Manipulator() {
    motor = new CANSparkMax(24, MotorType.kBrushless);
    motor.setSmartCurrentLimit(20);
    
    motor.restoreFactoryDefaults();
    motor.setIdleMode(IdleMode.kBrake);
    motor.setInverted(true);
  }
  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
  public void runManipulator(){
    motor.set(.7);
  }
  public void stopManipulator(){
    motor.set(0);
  }
  public void reverseManipulator(){
    motor.set(-.7);
  }
}
