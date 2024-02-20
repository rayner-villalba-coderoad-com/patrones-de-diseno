package com.upb.builder;

public enum HairType {
    BALD,
    CURLY,
    LONG_CURLY,
    LONG_STRAIGHT,
    SHORT;

    public String getHaiType() {
        switch (this) {
            case BALD:  //CALVO
                return "Calvo";
            case CURLY:  //RISADO
                return "Risado";
            case LONG_CURLY:  //ALTAMENTE RISADO
                return "Altamente Risado";
            case LONG_STRAIGHT:  //LARGO Y  CABELLO LIZO
                return "Largo y lizo";
            case SHORT:  //CORTO
                return "Corto";
            default:
                return null;
        }
    }
}
