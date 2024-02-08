package com.upb.interfaces;

public class MarioGame implements GameConsole {
    //Add emoji https://emojipedia.org/money-mouth-face
    public void up() {
        System.out.println("Salta \uD83E\uDD98!!");
    }

    public void down() {
        System.out.println("Entrar en el hueco \uD83D\uDC47!!!");
    }

    public void left() {
        System.out.println("Ir atrás... \uD83D\uDD19");
    }

    public void right() {
        System.out.println("Corre.... \uD83C\uDFC3");
    }
}
