// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import frc.robot.Constants.OperatorConstants;
import frc.robot.commands.IntakeCube;
import frc.robot.commands.ReverseCube;
import frc.robot.subsystems.Indexer;
import frc.robot.subsystems.Intake;
import frc.robot.subsystems.Manipulator;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;


public class RobotContainer {
  private final Indexer indexer;
  private final Intake intake;
  private final Manipulator manipulator;

  private final CommandXboxController driver =
      new CommandXboxController(OperatorConstants.kDriverControllerPort);

  public RobotContainer() {
    // Configure the trigger bindings
    indexer = new Indexer();
    intake = new Intake();
    manipulator = new Manipulator();
    configureBindings();
  }

  private void configureBindings() {
    driver.leftTrigger().whileTrue(new IntakeCube(indexer, intake, manipulator));
    driver.rightTrigger().whileTrue(new ReverseCube(indexer, intake, manipulator));
  }

  public Command getAutonomousCommand() {
    // An example command will be run in autonomous
    return null;
  }
}
