package com.qualcomm.ftcrobotcontroller.opmodes;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

/**
 * Created by Ricky on 9/28/2015.
 */
public class Arm extends OpMode {

    DcMotor armr = hardwareMap.dcMotor.get("Arm_Right");
    DcMotor arml = hardwareMap.dcMotor.get("Arm_Left");

    public void armDrive () {
        float power = gamepad2.left_stick_y;
        armr.setPower(power);
        arml.setPower(power);
    }

    @Override
    public void init() {



    }

    @Override
    public void loop() {

    }
}
