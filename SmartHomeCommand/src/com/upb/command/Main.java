package com.upb.command;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Smart Home Command!!!");
        Light light = new Light();

        RemoteControl remoteControl = new RemoteControl();
        LightOffCommand lightOffCommand = new LightOffCommand(light);
        LightOnCommand lightOnCommand = new LightOnCommand(light);

        //SimpleRemoteControl simpleRemoteControl = new SimpleRemoteControl();
        //LightOnCommand lightOnCommand = new LightOnCommand(light);

        ///simpleRemoteControl.setCommand(lightOffCommand);
        //simpleRemoteControl.buttonWasPressed();


        GarageDoor garageDoor = new GarageDoor();
        GarageDoorOpenCommand garageDoorOpenCommand = new GarageDoorOpenCommand(garageDoor);
        GarageDoorCloseCommand garageDoorCloseCommand = new GarageDoorCloseCommand(garageDoor);

        Stereo stereo = new Stereo();
        StereoOnCommand stereoOnCommand = new StereoOnCommand(stereo);
        StereoOffCommand stereoOffCommand = new StereoOffCommand(stereo);

        //Add different commands
        remoteControl.setCommand(0, lightOnCommand, lightOffCommand);
        remoteControl.setCommand(1, garageDoorOpenCommand, garageDoorCloseCommand);
        remoteControl.setCommand(2, stereoOnCommand, stereoOffCommand);

        remoteControl.onButtonWasPressed(0);
        remoteControl.offButtonWasPressed(2);

    }
}
