package org.example.Coffee;

import org.example.Ingredient.TotalIngredient;

public class BlackCoffee extends TotalIngredient implements Coffee {

    @Override
    public void makeCoffee() {
        System.out.println("Black Coffee is Ready");

    }

    public BlackCoffee() {
    }
}
