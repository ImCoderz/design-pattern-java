package FactoryPattern.Coffee.entity;

public class Espresso implements Beverage {
    @Override
    public void prepare() {
        System.out.println("Preparing Espresso");
    }

    @Override
    public void displayIngredients() {
        System.out.println("Ingredients: Coffee beans, water");
    }
}