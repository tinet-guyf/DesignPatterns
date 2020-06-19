package com.gu.factory.abstractFactory.pizza;

import com.gu.factory.abstractFactory.pizzaIngredient.PizzaIngredientFactory;

/**
 * @author user
 * @date 2020/6/19 18:20
 */
public class CheesePizza extends Pizza {

    private PizzaIngredientFactory ingredientFactory;

    public CheesePizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
        clam = ingredientFactory.createClams();

    }
}
