package com.upb.decorator;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("File Storage UPB \uD83D\uDDA5️!!");


        DataSource dataSource = new FileDataSource("a.txt");
        System.out.println("Ejecutando datasource  " + dataSource.writeData("abcdef"));
        System.out.println("Leyendo datasource  " + dataSource.readData());
        EncryptionDecorator encryptionDecorator = new EncryptionDecorator(dataSource);

        System.out.println("Ejecutando encriptacion " + encryptionDecorator.writeData("abcdef"));
        System.out.println("Ejecutando leyendo " + encryptionDecorator.readData());
}
}
