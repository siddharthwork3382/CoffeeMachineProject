package org.example.Water;

import org.example.Ingredient.TotalIngredient;

class WarmWater extends TotalIngredient implements Water {

    @Override
    public void makeWater() {
        System.out.println("Warm Water is Ready");

    }
}
