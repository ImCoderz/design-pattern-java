package FactoryPattern.Coffee.entity;

public class RegularCoffee implements Beverage {
    @Override
    public void prepare() {
        System.out.println("Preparing Regular Coffee");
    }

    @Override
    public void displayIngredients() {
        System.out.println("Ingredients: Coffee beans, water, sugar (optional)");
    }
}
