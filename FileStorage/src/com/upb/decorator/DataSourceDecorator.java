package com.upb.decorator;

public abstract class DataSourceDecorator implements DataSource{
    DataSource wrappee;

    public DataSourceDecorator(DataSource s) {
        this.wrappee = s;
    }

    @Override
    public String writeData(String data) {
         return this.wrappee.writeData(data);
    }

    @Override
    public String readData() {
        return this.wrappee.readData();
    }
}
