package com.upb.builder;

public enum Weapon {
    AXE,
    BOW,
    DAGGER,
    SWORD,
    WAR_HAMMER;

    public String getWeapon() {
        switch (this) {
            case AXE:  //Hacha
                return "Hacha";
            case BOW:  //Arco
                return "Arco";
            case DAGGER:  //Daga
                return "Daga";
            case SWORD:  //Espada
                return "Espada";
            case WAR_HAMMER:  //Martillo de guerra
                return "Martillo de guerra";
            default:
                return null;
        }
    }
}
