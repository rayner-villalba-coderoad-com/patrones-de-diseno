package com.upb.command;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Smart Home Command!!!");
        Light light = new Light();

        SimpleRemoteControl simpleRemoteControl = new SimpleRemoteControl();
        //LightOnCommand lightOnCommand = new LightOnCommand(light);
        LightOffCommand lightOffCommand = new LightOffCommand(light);
        simpleRemoteControl.setCommand(lightOffCommand);

        simpleRemoteControl.buttonWasPressed();
    }
}
