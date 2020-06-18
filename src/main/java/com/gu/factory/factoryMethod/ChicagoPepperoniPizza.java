package com.gu.factory.factoryMethod;

/**
 * @author user
 * @date 2020/6/15 12:00
 */
public class ChicagoPepperoniPizza implements Pizza {
    @Override
    public void prepare() {
        System.out.println("NYPepperoniPizza.prepare");
    }

    @Override
    public void bake() {
        System.out.println("NYPepperoniPizza.bake");

    }

    @Override
    public void cut() {
        System.out.println("NYPepperoniPizza.cut");
    }

    @Override
    public void box() {
        System.out.println("NYPepperoniPizza.box");
    }
}
