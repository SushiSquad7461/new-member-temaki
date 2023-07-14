// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMax.IdleMode;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj.CAN;
import edu.wpi.first.wpilibj2.command.CommandBase;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Indexer extends SubsystemBase {
  private final CANSparkMax indexer;
  private final CANSparkMax hopper;
  /** Creates a new ExampleSubsystem. */
  public Indexer() {
    indexer = new CANSparkMax(21, MotorType.kBrushless);
    hopper = new CANSparkMax(25, MotorType.kBrushless);

    indexer.restoreFactoryDefaults();
    indexer.setIdleMode(IdleMode.kBrake);
    indexer.setInverted(true);

    hopper.restoreFactoryDefaults();
    hopper.setIdleMode(IdleMode.kBrake);
    hopper.setInverted(true);

  }

  @Override
  public void periodic() {
  }

  public void runIndexer(){
    indexer.set(1);
    hopper.set(0.5);
  }
  public void stopIndexer(){
    indexer.set(0);
    hopper.set(0);
  }
  public void reverseIndexer(){
    indexer.set(-1);
    hopper.set(-.5);
  }
}
