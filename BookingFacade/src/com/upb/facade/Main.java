package com.upb.facade;

public class Main {

    public static void main(String[] args) {
	   System.out.println("Sistema de reservas UPB!!!");

        CheckFacade cliente1 = new CheckFacade();
        cliente1.buscar("02/07/2018", "08/07/2018", "Lima", "Cancún");

        CheckFacade cliente2 = new CheckFacade();
        cliente2.buscar("02/07/2018", "08/07/2018", "Lima", "Quito");
    }
}
