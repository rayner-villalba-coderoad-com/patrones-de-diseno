package com.upb.factory_method;

public class Truck implements Transport {
    @Override
    public void deliver() {
        System.out.println("Entrega por tierra");
    }
}
