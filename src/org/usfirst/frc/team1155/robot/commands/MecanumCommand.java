package org.usfirst.frc.team1155.robot.commands;
import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Command;

import org.usfirst.frc.team1155.robot.Hardware;
import org.usfirst.frc.team1155.robot.Robot;
import org.usfirst.frc.team1155.robot.subsystems.MecanumDrive;

public class MecanumCommand extends Command{
	
	private Joystick rotationJoystick, positionJoystick;
	private RobotDrive mecanumDrive;
	
	public MecanumCommand(){
		requires(Robot.mecanumDrive);
		rotationJoystick = Hardware.INSTANCE.leftJoystick;
		positionJoystick = Hardware.INSTANCE.rightJoystick;
		mecanumDrive = new RobotDrive(1, 2, 3, 4);
	}
	
	@Override
	protected void initialize() {
		// TODO Auto-generated method stub
		mecanumDrive.mecanumDrive_Cartesian(positionJoystick.getX(), positionJoystick.getY(), Robot.mecanumDrive.getRate(),Robot.mecanumDrive.getRotation());
	}
	
	@Override
	protected void execute() {
		// TODO Auto-generated method stub
		Robot.mecanumDrive.rotateRobot(rotationJoystick.getX());
	}
	
	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}
	
	@Override
	protected void end() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	protected void interrupted() {
		// TODO Auto-generated method stub
		Robot.mecanumDrive.rotateRobot(0);
	}
  
}
