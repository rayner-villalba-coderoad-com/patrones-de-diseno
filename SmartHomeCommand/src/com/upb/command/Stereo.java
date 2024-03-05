package com.upb.command;

public class Stereo {
    public void on() {
        System.out.println("Stereo esta encendido!!");
    }

    public void off() {
        System.out.println("Stereo esta apagado!!");
    }

    public void setCD() {
        System.out.println("Agregando el CD al stereo!!");
    }

    public void setRadio() {
        System.out.println("Encender la radio");
    }

    public void setVolume(int volume) {
        System.out.println("Volumen: " + volume);
    }
}
