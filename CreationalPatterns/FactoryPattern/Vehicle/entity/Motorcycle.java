package FactoryPattern.Vehicle.entity;

public class Motorcycle implements Vehicle {
    @Override
    public void start() {
        System.out.println("start motorcycle");
    }

    @Override
    public void stop() {
        System.out.println("stop motorcycle");
    }

}