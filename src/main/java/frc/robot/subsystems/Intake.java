// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMax.IdleMode;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.PneumaticsModuleType;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class Intake extends SubsystemBase {
  private final CANSparkMax intakeTop;
  private final CANSparkMax intakeBottom;
  private final DoubleSolenoid solenoid;

  public Intake() {
    intakeTop = new CANSparkMax(Constants.kPorts.INTAKE_TOP_MOTOR_ID, MotorType.kBrushless);
    intakeBottom = new CANSparkMax(Constants.kPorts.INTAKE_BOTTOM_MOTOR_ID, MotorType.kBrushless);

    intakeTop.restoreFactoryDefaults();
    intakeTop.setIdleMode(IdleMode.kCoast);
    intakeTop.setInverted(Constants.kIntake.TOP_MOTOR_INVERTED);

    intakeBottom.restoreFactoryDefaults();
    intakeBottom.setIdleMode(IdleMode.kCoast);
    intakeBottom.setInverted(Constants.kIntake.BOTTOM_MOTOR_INVERTED);

    solenoid = new DoubleSolenoid(
        PneumaticsModuleType.REVPH, 
        Constants.kPorts.PNEUMATIC_FORWARD_CHANNEL, 
        Constants.kPorts.PNEUMATIC_REVERSE_CHANNEL
    );

    solenoid.set(Value.kReverse);
  }

  public void extendIntake() {
    solenoid.set(Value.kForward);
  }
  
  public void retractIntake() {
    solenoid.set(Value.kReverse);
  }

  public void runIntakeMotors() {
    intakeTop.set(Constants.kIntake.SPEED);
    intakeBottom.set(Constants.kIntake.SPEED);
  }

  public void stopIntakeMotors() {
    intakeTop.set(0.0);
    intakeBottom.set(0.0);
  }

  public void reverseIntakeMotors() {
    intakeTop.set(-Constants.kIntake.SPEED);
    intakeBottom.set(-Constants.kIntake.SPEED);
  }

  @Override
  public void periodic() { }
}
