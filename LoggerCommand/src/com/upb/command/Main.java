package com.upb.command;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Logger UPB: Command + Template Method");

        Light light = new Light();
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        LightOffCommand lightOffCommand = new LightOffCommand(light);

        SimpleControl simpleControl = new SimpleControl(lightOnCommand);

        simpleControl.execute();

        simpleControl.setCommand(lightOffCommand);

        simpleControl.execute();

    }
}
