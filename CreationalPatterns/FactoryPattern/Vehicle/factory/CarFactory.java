package FactoryPattern.Vehicle.factory;

import FactoryPattern.Vehicle.entity.Car;
import FactoryPattern.Vehicle.entity.Vehicle;

public class CarFactory implements VehicleFactory {

    @Override
    public Vehicle createVehicle() {
        return new Car();
    }

    
}