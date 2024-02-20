package com.upb.builder;

public enum HairColor {
    BLACK,
    BLOND,
    BROWN,
    RED,
    WHITE;

    public String getHairColor() {
        switch (this) {
            case BLACK:  //NEGRO
                return "Negro";
            case BLOND:  //RUBIO
                return "Rubio";
            case BROWN:  //CAFE
                return "Cafe";
            case RED:  //PELORROJO
                return "Pelirrojo";
            case WHITE:  //BLANCO
                return "Blanco";
            default:
                return null;
        }
    }

}
