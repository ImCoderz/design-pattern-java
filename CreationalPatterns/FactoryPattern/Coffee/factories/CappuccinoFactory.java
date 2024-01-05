package FactoryPattern.Coffee.factories;

import FactoryPattern.Coffee.entity.Beverage;
import FactoryPattern.Coffee.entity.Cappuccino;

public class CappuccinoFactory implements BeverageFactory {
    @Override
    public Beverage createBeverage() {
        return new Cappuccino();
    }
}