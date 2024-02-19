package com.upb.factory_method;

public class Ship implements Transport{
    @Override
    public void deliver() {
        System.out.println("Entrega de contenedor por mar");
    }
}
