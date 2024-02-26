package com.upb.decorator;

public abstract class EnemyDecorator implements Enemy {
    protected Enemy enemy;

    public EnemyDecorator(Enemy enemy) {
        this.enemy = enemy;
    }

    @Override
    public int takeDamage() {
        return enemy.takeDamage();
    }

    @Override
    public String getDescription() {
        return enemy.getDescription();
    }
}
