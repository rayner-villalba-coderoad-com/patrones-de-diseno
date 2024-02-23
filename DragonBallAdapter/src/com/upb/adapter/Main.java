package com.upb.adapter;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Dragon ball UPB!!!");

        Saiyan goku = new Saiyan();

        Namekian pikoro = new Namekian();


        Android n17 = new Android();

        AndroidAdapter androidAdapter = new AndroidAdapter(n17);


        System.out.println("Goku attacks: " + goku.attack());
        System.out.println("Picoro attacks: " + pikoro.attack());
        System.out.println("N17 attacks: " + androidAdapter.attack());
    }
}
