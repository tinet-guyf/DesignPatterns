package com.gu.factory.abstractFactory.pizza;

import com.gu.factory.abstractFactory.pizzaIngredient.PizzaIngredientFactory;

/**
 * @author user
 * @date 2020/6/19 18:21
 */
public class ClamPizza extends Pizza{
   private PizzaIngredientFactory ingredientFactory;

    public ClamPizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
    }
}
