package com.upb.decorator;

//Step 1 extends our decorator from abstract class decorator
public class WingsDecorator extends EnemyDecorator {
    //Step 2 In the constructor send the interface as a parameter
    public WingsDecorator(Enemy enemy) {
        super(enemy);
    }

    //Step 3 Implement functions of the interface
    public String getDescription() {
        return this.enemy.getDescription() + " con Alas";
    }
    //Step 3 Implement functions of the interface
    public int takeDamage() {
        return this.enemy.takeDamage() / 2;
    }
}
