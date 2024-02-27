package com.upb.facade;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Bienvenido a la Casa inteligente!!!");

        Lighting lighting = new Lighting();
        MusicSystem musicSystem = new MusicSystem();
        ClimateControl climateControl = new ClimateControl();

        SmartHomeFacade smartHomeFacade = new SmartHomeFacade(lighting, musicSystem, climateControl);

        smartHomeFacade.startEveningRouting();

        smartHomeFacade.endEveningRoutine();

    }
}
