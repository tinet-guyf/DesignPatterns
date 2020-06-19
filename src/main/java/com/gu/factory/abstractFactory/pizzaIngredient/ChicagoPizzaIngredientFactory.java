package com.gu.factory.abstractFactory.pizzaIngredient;

import com.gu.factory.abstractFactory.ingredient.*;
import com.gu.factory.abstractFactory.ingredient.impl.*;

/**
 * @author gu
 * @date 2020/6/19 22:38
 */
public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    @Override
    public Cheese createCheese() {
        return new MozzarellaCheese();
    }

    @Override
    public Veggie[] createVeggie() {
        Veggie veggies[] = {new EggPlant(), new Spinach()};
        return veggies;
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SllcedPepperoni();
    }

    @Override
    public Clams createClams() {
        return new FrozenClams();
    }
}
