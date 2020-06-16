package com.gu.factory.simpleFactory;

/**
 * @author user
 * @date 2020/6/15 11:56
 */
public class CheesePizza implements Pizza{

    @Override
    public void prepare() {
        System.out.println("CheesePizza.prepare");
    }

    @Override
    public void bake() {
        System.out.println("CheesePizza.bake");

    }

    @Override
    public void cut() {
        System.out.println("CheesePizza.cut");
    }

    @Override
    public void box() {
        System.out.println("CheesePizza.box");
    }
}
