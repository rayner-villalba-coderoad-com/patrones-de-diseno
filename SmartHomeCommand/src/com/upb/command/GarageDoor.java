package com.upb.command;

//Receiver
public class GarageDoor {
    public void up() {
        System.out.println("Puerta del garage arriba!!");
    }

    public void down() {
        System.out.println("Puerta del garage abajo!!");
    }

    public void stop() {
        System.out.println("Puerta del garage en stop!");
    }

    public void lightOn() {
        System.out.println("Luces del garage encendidas!");
    }

    public void lightOff() {
        System.out.println("Luces del garage apagadas!");
    }
}
