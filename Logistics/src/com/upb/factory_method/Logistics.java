package com.upb.factory_method;

public abstract class Logistics {
    public void planDelivery() {
        Transport transport = this.createTransport();
        transport.deliver();

    }

    //metodo creador
    protected abstract Transport createTransport();
}
