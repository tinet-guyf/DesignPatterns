package com.gu.strategy.duck03;

/**
 * @author user
 * @date 2020/6/11 16:31
 */
public abstract class Duck {

    protected FlyBehavior flyBehavior;

    protected QuackBehavior quackBehavior;

    /**
     * 鸭子不是自己去实现叫的行为，而是托管给quackBehavior引用的对象
     */
    public void performQuack(){
        quackBehavior.quack();
    }

    /**
     * 鸭子不是自己去实现飞行行为，而是托管给flyBehavior引用的对象
     */
    public void performFly(){
        flyBehavior.fly();
    }

    public void swim(){
        System.out.println("游泳");
    }

    public abstract void display();


    public FlyBehavior getFlyBehavior() {
        return flyBehavior;
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public QuackBehavior getQuackBehavior() {
        return quackBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
