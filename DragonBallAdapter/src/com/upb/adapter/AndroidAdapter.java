package com.upb.adapter;

public class AndroidAdapter implements Warrior{
    //Step 1 Add object to adapt
    private Android android;

    private int ATTACK_BASE = 50;

    //Step 2
    public AndroidAdapter(Android android) {
        this.android = android;
    }

    @Override
    public int attack() {
        return this.android.kick() + this.android.punch() + this.ATTACK_BASE;
    }
}
