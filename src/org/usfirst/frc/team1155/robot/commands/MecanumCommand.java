package org.usfirst.frc.team1155.robot.commands;
import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.command.Command;

import org.usfirst.frc.team1155.robot.Hardware;
import org.usfirst.frc.team1155.robot.Robot;
import org.usfirst.frc.team1155.robot.subsystems.MecanumDrive;

public class MecanumCommand extends Command{
	
	private Joystick rotationJoystick, positionJoystick;
	
	public MecanumCommand(){
		requires(Robot.mecanumDrive);
	}
	
	@Override
	protected void initialize() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	protected void execute() {
		// TODO Auto-generated method stub
		
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
		
	}
  
}
