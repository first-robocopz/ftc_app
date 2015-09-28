package com.qualcomm.ftcrobotcontroller.opmodes;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.util.ElapsedTime;

/**
 * Created by Ricky on 9/17/2015.
 */
public class DriveTrain extends OpMode{

    //initialize motor objects
    DcMotor leftMotor;
    DcMotor rightMotor;
    ElapsedTime driveTime = new ElapsedTime();
    boolean start = true;
    @Override
    public void init() {

        //set motor object definitions
        leftMotor = hardwareMap.dcMotor.get("motorL");
        rightMotor = hardwareMap.dcMotor.get("motorR");
        //reverse right motor direction
        rightMotor.setDirection(DcMotor.Direction.REVERSE);







    }

    @Override
    public void loop() {

        //float leftY = -gamepad1.left_stick_y;
        //float rightY = -gamepad1.right_stick_y;
        //float leftYcurve = leftY * leftY;
        //float rightYcurve = rightY * rightY;
        //double leftY = .5;
        //double rightY = .5;


        //leftMotor.setPower(leftY);
        //rightMotor.setPower(rightY);
        while (start)
        {
            leftMotor.setPower(0.5);
            rightMotor.setPower(0.5);
            start = false;
        }
        if (driveTime.time()>= 2.0)
        {
            leftMotor.setPower(0.0);
            rightMotor.setPower(0.0);
        }
    }
}
