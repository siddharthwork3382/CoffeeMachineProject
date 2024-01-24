package org.example.Tea;

import org.example.Ingredient.TotalIngredient;

public class GreenTea extends TotalIngredient implements tea {

    @Override
    public void makeTea() {
        System.out.println("Green Tea is Ready");
    }
}
