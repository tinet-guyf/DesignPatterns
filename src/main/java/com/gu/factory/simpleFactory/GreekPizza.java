package com.gu.factory.simpleFactory;

/**
 * @author user
 * @date 2020/6/15 11:59
 */
public class GreekPizza implements Pizza {
    @Override
    public void prepare() {
        System.out.println("GreekPizza.prepare");
    }

    @Override
    public void bake() {
        System.out.println("GreekPizza.bake");

    }

    @Override
    public void cut() {
        System.out.println("GreekPizza.cut");
    }

    @Override
    public void box() {
        System.out.println("GreekPizza.box");
    }
}
