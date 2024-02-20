package com.upb.builder;

public enum Profession {
    MAGE,
    PRIEST,
    THIEF,
    WARRIOR;

    public String getProfession() {
        switch (this) {
            case MAGE:  //Mago
                return "Mago \uD83E\uDDD9\u200D️";
            case PRIEST:  //Sacerdote
                return "Sacerdote \uD83E\uDDDD";
            case THIEF:  //Ladron
                return "Ladron \uD83E\uDDD5";
            case WARRIOR:  //Guerrero
                return "Guerrero \uD83E\uDDD1\u200D\uD83D\uDCBB";
            default:
                return null;
        }
    }
}
