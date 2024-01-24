package BehavioralPatterns.StatePattern.entity;

import BehavioralPatterns.StatePattern.context.VendingMachine;

public class HasCoinState implements VendingMachineState {
    @Override
    public void insertCoin(VendingMachine context) {
        System.out.println("Coin already inserted.");
    }

    @Override
    public void selectItem(VendingMachine context) {
        System.out.println("Item selected.");
        context.setState(new ItemSelectedState());
    }

    @Override
    public void dispenseItem(VendingMachine context) {
        System.out.println("Please select an item first.");
    }
}
