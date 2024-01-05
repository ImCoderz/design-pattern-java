package FactoryPattern.Vehicle.entity;

public class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("start car");
    }

    @Override
    public void stop() {
        System.out.println("stop car");
    }

    
}