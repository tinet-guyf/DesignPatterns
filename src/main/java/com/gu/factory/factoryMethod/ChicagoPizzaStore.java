package com.gu.factory.factoryMethod;


/**
 * @author gu
 * @date 2020/6/18 22:41
 */
public class ChicagoPizzaStore extends PizzaStore{

    @Override
    Pizza creatPizza(String type) {
        Pizza pizza = null;
        switch (type) {
            case "cheese":
                pizza = new ChicagoCheesePizza();
                break;
            case "greek":
                pizza = new ChicagoGreekPizza();
                break;
            case "pepperoni":
                pizza = new ChicagoPepperoniPizza();
                break;
            default:
                break;
        }
        return pizza;
    }
}
