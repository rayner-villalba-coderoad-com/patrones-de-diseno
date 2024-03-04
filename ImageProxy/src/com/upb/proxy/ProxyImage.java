package com.upb.proxy;

//Step 1 Implement the common interface
public class ProxyImage implements Image{
    //Step 2 Declare the object that will be accessed
    private RealImage realImage;
    private String filename;

    public ProxyImage(String filename) {
        this.filename = filename;
    }

    public void display() {
        if (realImage == null) {
            realImage = new RealImage(filename);
        }
        realImage.display();
    }


}
