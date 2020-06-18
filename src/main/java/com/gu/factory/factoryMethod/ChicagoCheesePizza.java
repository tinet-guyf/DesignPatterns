package com.gu.factory.factoryMethod;
/**
 * @author user
 * @date 2020/6/15 11:56
 */
public class ChicagoCheesePizza implements Pizza{

    @Override
    public void prepare() {
        System.out.println("NYCheesePizza.prepare");
    }

    @Override
    public void bake() {
        System.out.println("NYCheesePizza.bake");

    }

    @Override
    public void cut() {
        System.out.println("NYCheesePizza.cut");
    }

    @Override
    public void box() {
        System.out.println("NYCheesePizza.box");
    }
}
