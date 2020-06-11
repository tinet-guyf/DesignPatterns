package com.gu.strategy.duck03;

/**
 * @author user
 * @date 2020/6/11 17:34
 */
public class MallardDuck extends Duck{

    /**
     * MallardDuck会快速的飞行也会嘎嘎叫，当performFly()被调用时就会托管给FlyFast的fly()方法
     */
    public MallardDuck() {
        this.flyBehavior = new FlyFast();
        this.quackBehavior = new QuackGaga();

    }

    public void display() {
        System.out.println("是一只MallardDuck");
    }
}
