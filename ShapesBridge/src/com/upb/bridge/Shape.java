package com.upb.bridge;

public abstract class Shape {
    //Step 1 Declare an interface attribute
    protected Color color;

    //Step 2 Send the interface as an parameter in the constructor
    public Shape(Color c) {
        this.color = c;
    }

    public abstract void applyColor();

}
