// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
  public static class kPorts {
    public static final int INDEXER_MOTOR_ID = 21;
      public static final int CONE_RAMP_MOTOR_ID = 25;
      public static final int INTAKE_BOTTOM_MOTOR_ID = 20;
      public static final int INTAKE_TOP_MOTOR_ID = 26;
      public static final int PNEUMATIC_FORWARD_CHANNEL = 0;
      public static final int PNEUMATIC_REVERSE_CHANNEL = 2;
      public static final int MANIPULATOR_MOTOR_ID = 24;
  }

  public static class kIntake {
    public static final boolean TOP_MOTOR_INVERTED = false;
    public static final boolean BOTTOM_MOTOR_INVERTED = true;
    public static final double SPEED = 0.5;
  }

  public static class kManipulator {
    public static final boolean INVERTED = true;
    public static final double speed = 0.7;
  }

  public static class kIndexer {
    public static final boolean INDEXER_INVERTED = true;
    public static final boolean CONE_RAMP_INVERTED = true;
    public static final double INDEXER_SPEED = 1.0;
    public static final double CONE_RAMP_SPEED = 0.5;
  }

  public static class OperatorConstants {
    public static final int kDriverControllerPort = 0;
  }
}
