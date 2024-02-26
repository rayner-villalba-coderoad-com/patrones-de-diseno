package com.upb.decorator;

public class HelmetDecorator extends EnemyDecorator{

    public HelmetDecorator(Enemy enemy) {
        super(enemy);
    }

    public String getDescription() {
        return this.enemy.getDescription() + " con casco";
    }

    public int takeDamage() {
        return this.enemy.takeDamage() / 3;
    }
}
