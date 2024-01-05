package FactoryPattern.Coffee.entity;

public class Cappuccino implements Beverage {
    @Override
    public void prepare() {
        System.out.println("Preparing Cappuccino");
    }

    @Override
    public void displayIngredients() {
        System.out.println("Ingredients: Espresso, steamed milk, foam");
    }
}
