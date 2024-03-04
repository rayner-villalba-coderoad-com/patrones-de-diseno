package com.upb.bridge;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Shapes!!!");

        Shape tri = new Triangle(new GreenColor());
        tri.applyColor();

        Shape pent = new Pentagon(new RedColor());
        pent.applyColor();

    }
}
