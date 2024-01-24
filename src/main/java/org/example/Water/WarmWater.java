package org.example.Water;

import org.example.Ingredient.TotalIngredient;

public class WarmWater extends TotalIngredient implements Water {

    @Override
    public void makeWater() {
        System.out.println("Warm Water is Ready");

    }
}
