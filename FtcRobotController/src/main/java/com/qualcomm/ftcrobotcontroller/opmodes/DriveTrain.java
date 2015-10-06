package com.qualcomm.ftcrobotcontroller.opmodes;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

/**
 * Created by Ricky on 9/17/2015.
 */
public class DriveTrain extends OpMode{
    private DcMotor leftMotor;
    private DcMotor rightMotor;

   public DriveTrain () {
        //initialize motor objects
        leftMotor = hardwareMap.dcMotor.get("motorL");
        rightMotor = hardwareMap.dcMotor.get("motorR");
        rightMotor.setDirection(DcMotor.Direction.REVERSE);
    }
    public void setMotorPower (double pow) {
        leftMotor.setPower(pow);
        rightMotor.setPower(pow);
    }
    public void setLeftPower (double powl) {

        leftMotor.setPower(powl);
    }
    public void setRightPower (double powr) {

        rightMotor.setPower(powr);
    }
    public void tankDrive () {
        //get gamepad values
        double leftY = -gamepad1.left_stick_y;
        double rightY = -gamepad1.right_stick_y;

        //set motors to gamepad values
        setLeftPower(leftY);
        setRightPower(rightY);
    }
    public void stopMotors() {
        setMotorPower(0);
    }

    @Override
    public void init() {


        leftMotor = hardwareMap.dcMotor.get("motorL");
        rightMotor = hardwareMap.dcMotor.get("motorR");
        leftMotor.setDirection(DcMotor.Direction.REVERSE);








    }

    @Override
    public void loop() {

        tankDrive();

    }
}
