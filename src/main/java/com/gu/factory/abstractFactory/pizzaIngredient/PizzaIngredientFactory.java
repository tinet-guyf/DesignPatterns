package com.gu.factory.abstractFactory.pizzaIngredient;

import com.gu.factory.abstractFactory.ingredient.*;

/**
 * 原料工厂
 * @author user
 * @date 2020/6/19 17:56
 */
public interface PizzaIngredientFactory {

    public Dough createDough();

    public Sauce createSauce();

    public Cheese createCheese();

    public Veggie[] createVeggie();

    public Pepperoni createPepperoni();

    public Clams createClams();
}
