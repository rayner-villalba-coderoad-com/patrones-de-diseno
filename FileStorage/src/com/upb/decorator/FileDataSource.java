package com.upb.decorator;

public class FileDataSource implements DataSource{
    private String fileName;

    public FileDataSource(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public String writeData(String data) {
        return "Escribiendo el archivo con: " + data;
    }

    @Override
    public String readData() {
        return "Leyendo el contenido!!!";
    }
}
