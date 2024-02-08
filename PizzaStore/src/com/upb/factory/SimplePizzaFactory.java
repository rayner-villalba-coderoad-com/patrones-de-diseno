package com.upb.factory;


enum Pizzas {
    cheese,
    pepperoni,
    greek
};

public class SimplePizzaFactory {
    public Pizza createPizza(String type) {
        Pizza pizza = null;

        if (type.equals(Pizzas.cheese)) {
            pizza = new CheesePizza();
        }else {
            pizza = new PepperoniPizza();
        }

        return pizza;

    }
}
