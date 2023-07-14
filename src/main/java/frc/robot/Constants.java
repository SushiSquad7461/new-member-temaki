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
  public static final class kPorts{
    public static final int indexerID=21;
    public static final int hopperID=25;
    public static final int intake1ID=26;
    public static final int intake2ID=20;
    public static final int manipulatorID=24;
  }
  public static final class kManipulator{
    public static final int manipulatorLimit=20;
    public static final double manipulatorSpeed =.7;
    public static final boolean isInverted=true;
  }
  public static final class kIntaker{
    public static final double intakeSpeed=.5;
    public static final boolean intake1inverted=false;
    public static final boolean intake2inverted=true;
  }
  public static final class kIndexer{
    public static final boolean indexerInverted=true;
    public static final boolean hopperInverted=true;
    public static final int indexerSpeed=1;
    public static final double hopperSpeed=.5;
  }
  public static class OperatorConstants {
    public static final int kDriverControllerPort = 0;
  }
}
