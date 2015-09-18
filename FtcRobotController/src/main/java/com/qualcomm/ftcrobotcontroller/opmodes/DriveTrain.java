package com.qualcomm.ftcrobotcontroller.opmodes;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

/**
 * Created by Ricky on 9/17/2015.
 */
public class DriveTrain extends OpMode{

    //initialize motor objects
    DcMotor leftMotor;
    DcMotor rightMotor;

    @Override
    public void init() {

        //set motor object definitions
        leftMotor = hardwareMap.dcMotor.get("left_drive");
        rightMotor = hardwareMap.dcMotor.get("right_drive");

        //reverse right motor direction
        rightMotor.setDirection(DcMotor.Direction.REVERSE);

    }

    @Override
    public void loop() {

        float leftY = -gamepad1.left_stick_y;
        float rightY = -gamepad1.right_stick_y;
        float leftYcurve = leftY * leftY;
        float rightYcurve = rightY * rightY;

        leftMotor.setPower(leftYcurve);
        rightMotor.setPower(rightYcurve);

    }
}
