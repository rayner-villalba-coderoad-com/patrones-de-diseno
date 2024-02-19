package com.upb.factory_method;

public class SeaLogistics extends Logistics{
    @Override
    protected Transport createTransport() {
        return new Ship();
    }
}
