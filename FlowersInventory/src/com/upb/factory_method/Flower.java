package com.upb.factory_method;

public class Flower {
    private int id;
    private String name;
    private long stock;

    //Constructor
    public Flower() {

    }

    public long totalStock() {
        return this.stock;
    }
}
