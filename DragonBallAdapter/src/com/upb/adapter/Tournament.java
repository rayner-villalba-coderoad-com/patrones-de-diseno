package com.upb.adapter;

import java.util.List;

public class Tournament {
    List<Warrior> warriors;

    public Tournament(List<Warrior> warriors) {
        this.warriors = warriors;
    }

    public void addNewWarrior(Warrior newWarrior) {
        this.warriors.add(newWarrior);
    }

    public List<Warrior> getWarriors() {
        return this.warriors;
    }
}
