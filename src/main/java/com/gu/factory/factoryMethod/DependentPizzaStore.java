package com.gu.factory.factoryMethod;

/**
 * 没有使用工厂模式的pizzaStore
 *
 * @author user
 * @date 2020/6/19 11:19
 */
public class DependentPizzaStore {

    public Pizza creatPizza(String style, String type){

        Pizza pizza = null;
        if("NY".equals(style)){
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
        } else if("Chicago".equals(style)){
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
        }else {
            System.out.println("Error: invalid type of pizza");
            return null;
        }
        return pizza;
    }
}
