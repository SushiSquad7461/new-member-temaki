// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMax.IdleMode;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj.CAN;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.PneumaticsModuleType;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj2.command.CommandBase;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Intaker extends SubsystemBase {
  private final CANSparkMax intake1;
  private final CANSparkMax intake2;
  private final DoubleSolenoid solenoid;
  public Intaker() {
    intake1 = new CANSparkMax(26, MotorType.kBrushless);
    intake2 = new CANSparkMax(20, MotorType.kBrushless);

    solenoid = new DoubleSolenoid(
      PneumaticsModuleType.REVPH,
      0,
      2
    );
    solenoid.set(Value.kReverse);

    intake1.restoreFactoryDefaults();
    intake1.setIdleMode(IdleMode.kCoast);
    intake1.setInverted(false);
    
    intake2.restoreFactoryDefaults();
    intake2.setIdleMode(IdleMode.kCoast);
    intake2.setInverted(true);
  }
  public void extendIntake(){
    solenoid.set(Value.kForward);
  }
  public void retractIntake(){
    solenoid.set(Value.kReverse);
  }
  public void runIntakeMotors(){
    intake1.set(0.5);
    intake2.set(0.5);
  }
  public void reverseIntakeMotors(){
    intake1.set(-0.5);
    intake2.set(-0.5);
  }
  public void periodic() {
  }
  public void stopIntakeMotors(){
    intake1.set(0);
    intake2.set(0);
  }
}
