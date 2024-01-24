package org.example.Ingredient;

public class TotalIngredient {
    private static double teaQty=100;
    private static double sugarQty=100;
    private static double milkQty=100;
    private static double waterQty=100;
    private static double coffeeQty=100;

    public static double getCoffeeQty() {
        return coffeeQty;
    }

    public static void setCoffeeQty(double coffeeQty) {
        TotalIngredient.coffeeQty = coffeeQty;
    }

    public static double getTeaQty() {
        return teaQty;
    }

    public static void setTeaQty(double teaQty) {
        TotalIngredient.teaQty = teaQty;
    }

    public static double getSugarQty() {
        return sugarQty;
    }

    public static void setSugarQty(double sugarQty) {
        TotalIngredient.sugarQty = sugarQty;
    }

    public static double getMilkQty() {
        return milkQty;
    }

    public static void setMilkQty(double milkQty) {
        TotalIngredient.milkQty = milkQty;
    }

    public static double getWaterQty() {
        return waterQty;
    }

    public static void setWaterQty(double waterQty) {
        TotalIngredient.waterQty = waterQty;
    }
}
