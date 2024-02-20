package com.upb.builder;

public final class Hero {
    private final Profession profession;
    private final String name;
    private final HairType hairType;
    private final HairColor hairColor;
    private final Armor armor;
    private final Weapon weapon;



//    public Hero(Profession profession, String name, HairType hairType, HairColor hairColor, Armor armor, Weapon weapon) {
//        this.profession = profession;
//        this.name = name;
//        this.hairType = hairType;
//        this.hairColor = hairColor;
//        this.armor = armor;
//        this.weapon = weapon;
//    }

    public Hero(Builder builder) {
        this.profession = builder.profession;
        this.name = builder.name;
        this.hairColor = builder.hairColor;
        this.hairType = builder.hairType;
        this.weapon = builder.weapon;
        this.armor = builder.armor;
    }

    @Override
    public String toString() {
        return "Personaje {" +
                "\n Con profession=" + this.getProfession() +
                ",\n Nombre='" + name + '\'' +
                ",\n Tipo de Cabello=" +  this.getHairType() +
                ",\n Color de Cabello=" + this.getHairColor() +
                ",\n Armadura=" + this.getArmor() +
                ",\n Arma=" + this.getWeapon() +
                '}';
    }

    public String getProfession() {
        if (profession != null && !profession.getProfession().isEmpty()) {
            return profession.getProfession();
        }
        return "NO tiene profession";
    }

    public String getName() {
        return name;
    }

    public String getHairType() {
        if (hairType != null && !hairType.getHaiType().isEmpty()) {
            return hairType.getHaiType();
        }

        return "No tiene tipo de pelo asignado";
    }

    public String getHairColor() {
        if (hairColor != null && !hairColor.getHairColor().isEmpty()) {
            return hairColor.getHairColor();
        }

        return "No tiene Color de pelo";
    }

    public String getArmor() {
        if (armor != null && !armor.getArmor().isEmpty()) {
            return armor.getArmor();
        }

        return "No tiene armadura ";
    }

    public String getWeapon() {
        if (weapon != null && !weapon.getWeapon().isEmpty()) {
            return weapon.getWeapon();
        }

        return "No tiene arma";
    }
}