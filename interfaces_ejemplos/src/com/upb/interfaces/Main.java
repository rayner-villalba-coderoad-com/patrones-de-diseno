package com.upb.interfaces;

public class Main {

    public static void main(String[] args) {
        System.out.println("UPB Video console Game!!!!");
        //MarioGame game = new MarioGame();
        SuperContraGame game = new SuperContraGame();
        GameRunner gameRunner = new GameRunner(game);
        gameRunner.run();
    }
}



