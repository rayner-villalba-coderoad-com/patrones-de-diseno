package com.upb.decorator;

public class WingsDecorator extends EnemyDecorator{
    public WingsDecorator(Enemy enemy) {
        super(enemy);
    }

    public String getDescription() {
        return this.enemy.getDescription() + " con Alas";
    }

    public int takeDamage() {
        return this.enemy.takeDamage() / 2;
    }
}
