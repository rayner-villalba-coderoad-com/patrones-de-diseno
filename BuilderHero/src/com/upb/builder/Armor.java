package com.upb.builder;

public enum Armor {
    CHAIN_MAIL,
    CLOTHES,
    LEATHER,
    PLATE_MAIL;

    public String getArmor() {
        switch (this) {
            case CHAIN_MAIL:  //Cadenas
                return "Cadenas";
            case CLOTHES:  //Ropas
                return "Ropas";
            case LEATHER:  //Cuero
                return "Cuero";
            case PLATE_MAIL:  //Places de correo
                return "Places de correo";
            default:
                return null;
        }
    }
}
