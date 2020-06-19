package com.gu.factory.abstractFactory.pizza;

import com.gu.factory.abstractFactory.ingredient.*;

/**
 * @author user
 * @date 2020/6/15 11:56
 */
public abstract class Pizza {

    String name = null;

    Dough dough = null;

    Sauce sauce = null;

    Veggie veggies[] = {};

    Cheese cheese = null;

    Pepperoni pepperoni = null;

    Clams clam = null;

    /**
     * 准备食材,从抽象工厂中获取各种食材
     */
    abstract public void prepare();

    /**
     * 烘烤
     */
    public void bake(){
        System.out.println("Bake for 20 minutes.....");
    }

    /**
     * 切片
     */
    public void cut(){
        System.out.println("Cutting into slices....");
    }

    /**
     * 包装
     */
    public void box(){
        System.out.println("Box pizza ....");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Pizza.......";
    }
}
