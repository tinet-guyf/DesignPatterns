package com.gu.factory.factoryMethod;

/**
 * @author user
 * @date 2020/6/15 11:55
 */
public abstract class PizzaStore {

    public Pizza orderPizza(String type){
        Pizza pizza;
        pizza = creatPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    /**
     * 制作pizza的抽象方法，由子类自定义实例化那种pizza
     * @param type
     * @return
     */
    abstract Pizza creatPizza(String type);
}
