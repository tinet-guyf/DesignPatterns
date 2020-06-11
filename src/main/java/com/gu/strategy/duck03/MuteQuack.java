package com.gu.strategy.duck03;

/**
 * @author user
 * @date 2020/6/11 17:01
 */
public class MuteQuack implements QuackBehavior
{
    public void quack() {
        System.out.println("沉默鸭");
    }
}
