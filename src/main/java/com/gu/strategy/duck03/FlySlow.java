package com.gu.strategy.duck03;

/**
 * @author user
 * @date 2020/6/11 16:45
 */
public class FlySlow implements FlyBehavior {
    public void fly() {
        System.out.printf("慢速飞行");
    }
}
