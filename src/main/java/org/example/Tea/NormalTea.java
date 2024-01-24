package org.example.Tea;

import org.example.Ingredient.TotalIngredient;

class NormalTea extends TotalIngredient implements tea  {

    @Override
    public void makeTea() {
        System.out.println("Normal Tea is Ready");

    }


}

