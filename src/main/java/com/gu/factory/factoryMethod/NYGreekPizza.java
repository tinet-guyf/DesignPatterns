package com.gu.factory.factoryMethod;

/**
 * @author user
 * @date 2020/6/15 11:59
 */
public class NYGreekPizza implements Pizza {
    @Override
    public void prepare() {
        System.out.println("NYGreekPizza.prepare");
    }

    @Override
    public void bake() {
        System.out.println("NYGreekPizza.bake");

    }

    @Override
    public void cut() {
        System.out.println("NYGreekPizza.cut");
    }

    @Override
    public void box() {
        System.out.println("NYGreekPizza.box");
    }
}
