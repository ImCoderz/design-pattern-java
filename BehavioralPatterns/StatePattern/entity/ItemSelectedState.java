package BehavioralPatterns.StatePattern.entity;

import BehavioralPatterns.StatePattern.context.VendingMachine;

public class ItemSelectedState implements VendingMachineState {
    @Override
    public void insertCoin(VendingMachine context) {
        
        System.out.println("Coin already inserted.");
    }

    @Override
    public void selectItem(VendingMachine context) {
        System.out.println("Item already selected.");
    }

    @Override
    public void dispenseItem(VendingMachine context) {
        System.out.println("Item dispensed. Enjoy your purchase!");
        context.setState(new NoCoinState());
    }
}