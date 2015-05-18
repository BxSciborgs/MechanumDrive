package org.usfirst.frc.team1155.robot.subsystems;

import org.usfirst.frc.team1155.robot.Hardware;

import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.CANTalon.ControlMode;
import edu.wpi.first.wpilibj.Gyro;
import edu.wpi.first.wpilibj.command.Subsystem;

public class MecanumDrive extends Subsystem{
	
  private Gyro gyro;
  private CANTalon frontLeftTalon, frontRightTalon, backLeftTalon, backRightTalon;
  
  public MecanumDrive(){
	  //gyro = Hardware.INSTANCE.gyro;
	  //gyro.reset();
	  
	  frontLeftTalon = Hardware.INSTANCE.frontLeftTalon;
	  frontRightTalon = Hardware.INSTANCE.frontRightTalon;
	  backLeftTalon = Hardware.INSTANCE.backLeftTalon;
	  backRightTalon = Hardware.INSTANCE.backRightTalon;
  }
  
  public int getRotation(){
	  return 0; //gyro.getAngle();
  }
  
  public int getRate(){
	  return 0; //gyro.getRate();
  }
  
  public void rotateRobot(double speed){
	  frontLeftTalon.set(speed);
	  backLeftTalon.set(speed);
	  frontRightTalon.set(-speed);
	  backRightTalon.set(-speed);
  }
  
@Override
protected void initDefaultCommand() {
	// TODO Auto-generated method stub
	
}
  
  
}
