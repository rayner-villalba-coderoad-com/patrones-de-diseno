package com.upb.adapter;

public class Saiyan implements Warrior {
    public int ATTACK_BASE = 100;

    @Override
    public int attack() {
        return (int) (Math.random() * 100 + this.ATTACK_BASE);
    }
}
