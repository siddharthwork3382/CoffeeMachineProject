package org.example.Milk;

import org.example.Ingredient.TotalIngredient;

class HotMilk extends TotalIngredient implements Milk {

    @Override
    public void makeMilk() {
        System.out.println("HotMilk is Ready");

    }
}
