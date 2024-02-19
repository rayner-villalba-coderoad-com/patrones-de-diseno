package com.upb.factory_method;

public class Main {

    public static void main(String[] args) {
	// write your code here

        System.out.println("Logictcs UPB");
        SeaLogistics seaLogistics = new SeaLogistics();
        seaLogistics.planDelivery();

        RoadLogistics roadLogistics = new RoadLogistics();
        roadLogistics.planDelivery();
    }
}
