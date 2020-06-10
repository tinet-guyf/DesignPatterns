package com.gu.strategy.duck01;

/**
 * @author gu
 * @date 2020/6/10 21:51
 */
public abstract class Duck {

    public void quack() {
        System.out.println("呱呱");
    }

    public void swim() {
        System.out.println("游泳");
    }

    public abstract void display();
}
