package FactoryPattern.Vehicle.factory;

import FactoryPattern.Vehicle.entity.Motorcycle;
import FactoryPattern.Vehicle.entity.Vehicle;

public class MotorcycleFactory implements VehicleFactory {

    @Override
    public Vehicle createVehicle() {
        return new Motorcycle();
    }
    
}
