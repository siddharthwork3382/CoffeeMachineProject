package org.example.Milk;

import org.example.Ingredient.TotalIngredient;

class BournvitaMilk extends TotalIngredient implements Milk {

    @Override
    public void makeMilk() {
        System.out.println("Bournvita Milk is Ready");

    }


}

