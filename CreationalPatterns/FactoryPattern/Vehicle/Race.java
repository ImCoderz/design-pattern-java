package FactoryPattern.Vehicle;

import FactoryPattern.Vehicle.entity.Vehicle;
import FactoryPattern.Vehicle.factory.CarFactory;
import FactoryPattern.Vehicle.factory.MotorcycleFactory;

public class Race {
    public static void main(String[] args) {
        MotorcycleFactory makemotor= new MotorcycleFactory();
        Vehicle motorcycle= makemotor.createVehicle();
        motorcycle.start();
        motorcycle.stop();
        System.out.println("--------------------------------------");
        CarFactory makecar=new CarFactory();
        Vehicle car=makecar.createVehicle();
        car.start();
        car.stop();
    }
}
