package com.company;

import com.company.pizza.Pizza;
import com.company.pizzaStore.ChicagoPizzaStore;
import com.company.pizzaStore.NYPizzaStore;
import com.company.pizzaStore.PizzaStore;

public class Main {

    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("Joel ordered a " + pizza.getName() + "\n");
    }
}
