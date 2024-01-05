package FactoryPattern.Coffee.factories;

import FactoryPattern.Coffee.entity.Beverage;
import FactoryPattern.Coffee.entity.Espresso;

public class EspressoFactory implements BeverageFactory {
    @Override
    public Beverage createBeverage() {
        return new Espresso();
    }
}
