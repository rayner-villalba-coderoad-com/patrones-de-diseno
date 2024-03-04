package com.upb.command;

//Step 1 Implement a concrete command where it should implement a Command interface
public class LightOnCommand implements Command{
    //Step 2 Use the receiver
    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}
