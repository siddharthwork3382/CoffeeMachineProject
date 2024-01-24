package org.example.Ingredient;

public class ChangeQuantity {

    public void reduceQuantity(String IngredientName, double quantity) {
        if (IngredientName == "tea")
            TotalIngredient.setTeaQty(TotalIngredient.getTeaQty() - quantity);
        else if (IngredientName == "coffee")
            TotalIngredient.setCoffeeQty(TotalIngredient.getCoffeeQty() - quantity);
        else if (IngredientName == "sugar")
            TotalIngredient.setSugarQty(TotalIngredient.getSugarQty() - quantity);
        else if (IngredientName == "milk")
            TotalIngredient.setMilkQty(TotalIngredient.getMilkQty() - quantity);
        else if (IngredientName == "water")
            TotalIngredient.setWaterQty(TotalIngredient.getWaterQty() - quantity);
        System.out.println("The quantity of "+ IngredientName+"is reduced");
    }

    public void increaseQuantity(String IngredientName, double quantity) {
        if (IngredientName == "tea")
            TotalIngredient.setTeaQty(TotalIngredient.getTeaQty() + quantity);
        else if (IngredientName == "coffee")
            TotalIngredient.setCoffeeQty(TotalIngredient.getCoffeeQty() + quantity);
        else if (IngredientName == "sugar")
            TotalIngredient.setSugarQty(TotalIngredient.getSugarQty() + quantity);
        else if (IngredientName == "milk")
            TotalIngredient.setMilkQty(TotalIngredient.getMilkQty() + quantity);
        else if (IngredientName == "water")
            TotalIngredient.setWaterQty(TotalIngredient.getWaterQty() + quantity);
        System.out.println("The quantity of "+ IngredientName+"is increased");
    }

    public void setQuantity(String IngredientName, double quantity) {
        if (IngredientName == "tea")
            TotalIngredient.setTeaQty(quantity);
        else if (IngredientName == "coffee")
            TotalIngredient.setCoffeeQty(quantity);
        else if (IngredientName == "sugar")
            TotalIngredient.setSugarQty(quantity);
        else if (IngredientName == "milk")
            TotalIngredient.setMilkQty(quantity);
        else if (IngredientName == "water")
            TotalIngredient.setWaterQty(quantity);
        System.out.println("The quantity of "+ IngredientName+"is set");
    }
    public double CheckQuantity(String IngredientName) {
        if (IngredientName == "tea")
            return TotalIngredient.getTeaQty();
        else if (IngredientName == "coffee")
            return TotalIngredient.getCoffeeQty();
        else if (IngredientName == "sugar")
            return TotalIngredient.getSugarQty();
        else if (IngredientName == "milk")
            return TotalIngredient.getMilkQty();
        else if (IngredientName == "water")
            return TotalIngredient.getWaterQty();

        return -1;
    }

}
