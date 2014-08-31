package edu.wpi.first.wpilibj.templates.commands;

/**
 *
 * @author Super NURDs
 */
public class CatapultReleaseLatch extends CommandBase {

    public CatapultReleaseLatch() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
        requires(catapult);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
        // None currently
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        // Sets the state of the Catapult Solenoid and retracts the hold for the Catapult
        // Releasing it and firing the ball
        catapult.releaseLatch();
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return true;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
        end();
    }
}