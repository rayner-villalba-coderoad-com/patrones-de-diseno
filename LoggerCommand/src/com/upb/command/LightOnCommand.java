package com.upb.command;

public class LightOnCommand extends Command{
    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }
    @Override
    void run() {
        light.on();
    }

    @Override
    void log() {
        System.out.println("Ejecutandose el comando LightOn!!!");
    }
}
