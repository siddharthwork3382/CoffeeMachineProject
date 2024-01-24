package org.example.Coffee;

import org.example.Ingredient.TotalIngredient;

public class Latte extends TotalIngredient implements Coffee {

    @Override
    public void makeCoffee() {
        System.out.println("Latte is Ready");
    }


}

