package org.example.Water;

import org.example.Ingredient.TotalIngredient;

class LemonWater extends TotalIngredient implements Water {

    @Override
    public void makeWater() {
        System.out.println("Normal Water is Ready");
    }


}

