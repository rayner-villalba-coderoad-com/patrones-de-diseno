package com.upb.bridge;

public class Triangle extends Shape{
    //Step 1 The interface is send as a parameter in the constructor
    public Triangle(Color c) {
        super(c);
    }

    @Override
    public void applyColor() {
        System.out.print("Triangle filled with color ");
        color.applyColor();


    }
}
