package com.gu.factory.factoryMethod;


/**
 * @author gu
 * @date 2020/6/18 22:41
 */
public class NYPizzaStore extends PizzaStore{

    @Override
    Pizza creatPizza(String type) {
        Pizza pizza = null;
        switch (type) {
            case "cheese":
                pizza = new NYCheesePizza();
                break;
            case "greek":
                pizza = new NYGreekPizza();
                break;
            case "pepperoni":
                pizza = new NYPepperoniPizza();
                break;
            default:
                break;
        }
        return pizza;
    }
}
