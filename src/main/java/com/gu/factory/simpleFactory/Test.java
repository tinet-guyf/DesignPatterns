package com.gu.factory.simpleFactory;

/**
 * @author user
 * @date 2020/6/15 15:24
 */
public class Test {

    public static void main(String[] args) {

        PizzaStore pizzaStore = new PizzaStore(new SimplePizzaFactory());

        pizzaStore.orderPizza("cheese");

        pizzaStore.orderPizza("greek");

        pizzaStore.orderPizza("pepperoni");
    }
}
