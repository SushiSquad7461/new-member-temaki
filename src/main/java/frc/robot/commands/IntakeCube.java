package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Indexer;
import frc.robot.subsystems.Intake;
import frc.robot.subsystems.Manipulator;

public class IntakeCube extends CommandBase {
    private final Indexer indexer;
    private final Intake intake; 
    private final Manipulator manipulator; 

    public IntakeCube(Indexer indexer, Intake intake, Manipulator manipulator) {
        this.indexer = indexer;
        this.intake = intake;
        this.manipulator = manipulator;

        addRequirements(indexer, intake, manipulator);
    }

    @Override
    public void initialize() {
        intake.extendIntake();
        intake.runIntakeMotors();
        indexer.runIndexer();
        manipulator.run();
    }

    @Override
    public void end(boolean interrupted) {
        intake.retractIntake();
        intake.stopIntakeMotors();
        indexer.stopIndexer();
        manipulator.stop();
    }
}
