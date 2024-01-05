package FactoryPattern.Coffee;

import FactoryPattern.Coffee.entity.Beverage;
import FactoryPattern.Coffee.factories.BeverageFactory;
import FactoryPattern.Coffee.factories.CappuccinoFactory;
import FactoryPattern.Coffee.factories.EspressoFactory;
import FactoryPattern.Coffee.factories.RegularCoffeeFactory;

public class CoffeeShopClient {
    public static void main(String[] args) {
        // Create Regular Coffee
        BeverageFactory regularCoffeeFactory = new RegularCoffeeFactory();
        Beverage regularCoffee = regularCoffeeFactory.createBeverage();

        regularCoffee.prepare();
        regularCoffee.displayIngredients();

        // Create Cappuccino
        BeverageFactory cappuccinoFactory = new CappuccinoFactory();
        Beverage cappuccino = cappuccinoFactory.createBeverage();

        cappuccino.prepare();
        cappuccino.displayIngredients();

        // Create Espresso
        BeverageFactory espressoFactory = new EspressoFactory();
        Beverage espresso = espressoFactory.createBeverage();

        espresso.prepare();
        espresso.displayIngredients();
    }
}
