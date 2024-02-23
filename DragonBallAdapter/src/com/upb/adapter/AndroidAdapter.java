package com.upb.adapter;

public class AndroidAdapter implements Warrior{
    private Android android;
    private int ATTACK_BASE = 50;

    public AndroidAdapter(Android android) {
        this.android = android;
    }

    @Override
    public int attack() {
        return this.android.kick() + this.android.punch() + this.ATTACK_BASE;
    }
}
