package com.upb.decorator;

public class EncryptionDecorator extends DataSourceDecorator{
    public EncryptionDecorator(DataSource s) {
        super(s);
    }

    @Override
    public String writeData(String data) {
        //Add logic to encrypt

        System.out.println("Encriptando datos: " + this.wrappee.writeData(data));

        return "Encriptando datos: " + this.wrappee.writeData(data);
    }

    @Override
    public String readData() {
        return this.wrappee.readData() + "XXX";
    }
}
