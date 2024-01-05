package FactoryPattern.Coffee.factories;

import FactoryPattern.Coffee.entity.Beverage;
import FactoryPattern.Coffee.entity.RegularCoffee;

public class RegularCoffeeFactory implements BeverageFactory {
    @Override
    public Beverage createBeverage() {
        return new RegularCoffee();
    }
}
