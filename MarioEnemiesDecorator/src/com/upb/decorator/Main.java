package com.upb.decorator;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Enemigos de Mario \uD83D\uDC22 \uD83C\uDF44!!!");

        Enemy koopa = new BaseEnemy();

        System.out.println("Daño del koopa: " + koopa.takeDamage());

        HelmetDecorator helmetKoopa = new HelmetDecorator(koopa);

        System.out.println("Enemigo: " + helmetKoopa.getDescription());
        System.out.println("Daño del koopa con Casco: " + helmetKoopa.takeDamage());

        WingsDecorator koopaWithWings = new WingsDecorator(koopa);
        System.out.println("Enemigo: " + koopaWithWings.getDescription());
        System.out.println("Daño del koopa con Alas: " + koopaWithWings.takeDamage());

    }
}
