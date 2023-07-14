// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMax.IdleMode;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class Indexer extends SubsystemBase {
  private final CANSparkMax indexer;
  private final CANSparkMax coneRamp;

  public Indexer() {
    indexer = new CANSparkMax(Constants.kPorts.INDEXER_MOTOR_ID, MotorType.kBrushless);
    coneRamp = new CANSparkMax(Constants.kPorts.CONE_RAMP_MOTOR_ID, MotorType.kBrushless);

    indexer.restoreFactoryDefaults();
    indexer.setIdleMode(IdleMode.kCoast);
    indexer.setInverted(Constants.kIndexer.INDEXER_INVERTED);

    coneRamp.restoreFactoryDefaults();
    coneRamp.setIdleMode(IdleMode.kCoast);
    coneRamp.setInverted(Constants.kIndexer.CONE_RAMP_INVERTED);
  }

  public void runIndexer() {
    indexer.set(Constants.kIndexer.INDEXER_SPEED);
    coneRamp.set(Constants.kIndexer.CONE_RAMP_SPEED);
  }

  public void reverseIndexer() {
    indexer.set(-Constants.kIndexer.INDEXER_SPEED);
    coneRamp.set(-Constants.kIndexer.CONE_RAMP_SPEED);
  }

  public void stopIndexer() {
    indexer.set(0.0);
    coneRamp.set(0.0);
  }

  @Override
  public void periodic() { }
}
