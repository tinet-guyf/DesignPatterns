package com.gu.strategy.duck03;

/**
 * @author user
 * @date 2020/6/11 17:04
 */
public class Test {
    public static void main(String[] args) {
        Duck duck = new MallardDuck();
        duck.display();
        duck.performFly();
        duck.performQuack();

        String s = null;
        String[] split = s.split(",");
        System.out.println(split.length);

    }
}
