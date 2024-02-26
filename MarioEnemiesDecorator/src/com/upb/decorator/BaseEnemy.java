package com.upb.decorator;

public class BaseEnemy implements Enemy {

    @Override
    public String getDescription() {
      return "Create enemy UPB";
    }

    @Override
    public int takeDamage() {
        return 100;
    }
}
