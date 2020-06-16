package com.gu.factory.simpleFactory;

/**
 * @author user
 * @date 2020/6/15 12:07
 */
public class SimplePizzaFactory {

    Pizza pizza = null;

    public Pizza creatPizza(String type) {
        switch(type){
            case "cheese":
                pizza = new CheesePizza();
                break;
            case "greek":
                pizza = new GreekPizza();
                break;
            case "pepperoni":
                pizza = new PepperoniPizza();
                break;
            default:break;

        }
        return pizza;
    }
}
