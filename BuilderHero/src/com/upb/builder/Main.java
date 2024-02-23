package com.upb.builder;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("UPB Video Game \uD83E\uDD77!!!");

        Scanner scanner = new Scanner(System.in);

        System.out.print("INGRESE EL NOMBRE DEL PERSONAJE \uD83E\uDDD1\u200D\uD83D\uDCBB: ");
        String name = scanner.next();
        Hero character = new Builder(Profession.WARRIOR, name).withHairType(HairType.BALD).withWeapon(Weapon.SWORD).build();
        //Hero character = new Builder(Profession.MAGE, name).withArmor(Armor.LEATHER).withHairColor(HairColor.BROWN).withWeapon(Weapon.SWORD).build();
        System.out.println(character);
    }


}
