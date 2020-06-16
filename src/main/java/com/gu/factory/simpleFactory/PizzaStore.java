package com.gu.factory.simpleFactory;

/**
 * @author user
 * @date 2020/6/15 11:55
 */
public class PizzaStore {

    SimplePizzaFactory simplePizzaFactory ;

    public PizzaStore(SimplePizzaFactory simplePizzaFactory){
        this.simplePizzaFactory = simplePizzaFactory;
    }

    public Pizza orderPizza(String type){
        Pizza pizza;
        pizza = simplePizzaFactory.creatPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }
}
