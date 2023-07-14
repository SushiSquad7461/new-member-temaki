package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMax.IdleMode;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class Manipulator extends SubsystemBase {
    private final CANSparkMax manipulatorMotor;

    public Manipulator() {
        manipulatorMotor = new CANSparkMax(Constants.kPorts.MANIPULATOR_MOTOR_ID, MotorType.kBrushless);

        manipulatorMotor.restoreFactoryDefaults();
        manipulatorMotor.setIdleMode(IdleMode.kCoast);
        manipulatorMotor.setInverted(Constants.kManipulator.INVERTED);
        manipulatorMotor.setSmartCurrentLimit(20);
    }

    public void run() {
        manipulatorMotor.set(Constants.kManipulator.speed);
    }

    public void reverse() {
        manipulatorMotor.set(-Constants.kManipulator.speed);
    }

    public void stop() {
        manipulatorMotor.set(0);
    }

    @Override
    public void periodic() {

    }
}
