package com.upb.command;

public class LightOffCommand extends Command {
    Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }
    @Override
    void run() {
        light.off();
    }

    @Override
    void log() {
        System.out.println("Ejecutandose el comando LightOff!!");
    }
}
