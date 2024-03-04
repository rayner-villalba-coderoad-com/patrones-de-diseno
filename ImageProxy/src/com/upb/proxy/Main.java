package com.upb.proxy;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Images!!!");
        RealImage image1 = new RealImage("example.jpg");
        RealImage image2 = new RealImage("example.jpg");
        RealImage image3 = new RealImage("example.jpg");

        Image image = new ProxyImage("example.jpg");
        image.display();
        image.display();

    }
}
