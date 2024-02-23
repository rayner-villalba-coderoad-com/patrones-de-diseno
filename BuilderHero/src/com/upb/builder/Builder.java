package com.upb.builder;

public class Builder {
    public final Profession profession;
    public final String name;
    public HairType hairType = HairType.BALD;
    public HairColor hairColor;
    public Armor armor;
    public Weapon weapon;


    //Step 2 Define constructor
    public Builder(Profession profession, String name) {
        if (profession == null || name == null) {
            throw new IllegalArgumentException("No podemos crear un nuevo personaje sin profesión y name");
        }
        this.profession = profession;
        this.name = name;
    }

    //Step 3 Define methods that will change the state of each attribute
    public Builder withHairType(HairType hairType) {
        this.hairType = hairType;
        //It should return the entire object
        return this;
    }

    public Builder withHairColor(HairColor hairColor) {
        this.hairColor = hairColor;
        return this;
    }

    public Builder withArmor(Armor armor) {
        this.armor = armor;
        return this;
    }

    public Builder withWeapon(Weapon weapon) {
        this.weapon = weapon;
        return this;
    }

    //Step 4
    public Hero build() {
        return new Hero(this);
    }
}
