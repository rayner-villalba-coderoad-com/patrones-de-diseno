package com.upb.factory;

public class CheesePizza extends Pizza {
    public CheesePizza() {
        //Suggestions you should use setter
        this.setName("Pizza de queso");
        dough = "Masa regular";
        sauce = "Salsa marinada";

        //Agregando los aderezos
        this.addTopping("Mozarella");
        this.addTopping("Parmesana");
    }
}
