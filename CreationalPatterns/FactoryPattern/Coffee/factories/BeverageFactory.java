package FactoryPattern.Coffee.factories;

import FactoryPattern.Coffee.entity.Beverage;

public interface BeverageFactory {
    Beverage createBeverage();
}
