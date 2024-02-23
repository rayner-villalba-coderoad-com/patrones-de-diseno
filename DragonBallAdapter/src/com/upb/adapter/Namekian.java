package com.upb.adapter;

public class Namekian implements Warrior{
    public int ATTACK_BASE = 50;

    @Override
    public int attack() {
        return (int) (Math.random() * 50 + this.ATTACK_BASE);
    }
}
