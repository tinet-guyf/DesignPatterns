package com.gu.factory.abstractFactory.pizza;

import com.gu.factory.abstractFactory.PizzaIngredientFactory;
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

    Cheese chess = null;

    Pepperoni pepperoni = null;

    Clams clam = null;

    /**
     * 准备食材,从抽象工厂中获取各种食材
     */
    abstract void prepare(PizzaIngredientFactory ingredientFactory);

    /**
     * 烘烤
     */
    void bake(){
        System.out.println("Bake for 20 minutes.....");
    }

    /**
     * 切片
     */
    void cut(){
        System.out.println("Cutting into slices....");
    }

    /**
     * 包装
     */
    void box(){
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
