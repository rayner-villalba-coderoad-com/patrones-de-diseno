package com.upb.factory;

public class Main {

    public static void main(String[] args) {
        System.out.println("Bienvenido a la tienda de Pizzas UPB");

        SimplePizzaFactory pizzaFactory = new SimplePizzaFactory();
        PizzaStore pizzaStore = new PizzaStore(pizzaFactory);
        pizzaStore.orderPizza("pepperoni");
    }
}
