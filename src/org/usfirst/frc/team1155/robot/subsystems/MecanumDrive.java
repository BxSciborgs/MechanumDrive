package org.usfirst.frc.team1155.robot.subsystems;

import org.usfirst.frc.team1155.robot.Hardware;

import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.Gyro;
import edu.wpi.first.wpilibj.command.Subsystem;

public class MecanumDrive extends Subsystem{
	
  private CANTalon FrontLeftTalon, RearLeftTalon, FrontRightTalon, RearRightTalon;
  public Gyro gyro;
  
  public MecanumDrive(){
	  //gyro = Hardware.INSTANCE.gyro;
	  
	  FrontLeftTalon = Hardware.INSTANCE.frontLeftTalon;
	  RearLeftTalon = Hardware.INSTANCE.backLeftTalon;
	  FrontRightTalon = Hardware.INSTANCE.frontRightTalon;
	  RearRightTalon = Hardware.INSTANCE.backRightTalon;
  }
  public static void set(double frontRightValue, double rearRightValue, double frontLeftValue){
	  
  }
@Override
protected void initDefaultCommand() {
	// TODO Auto-generated method stub
	
}
  
  
}
