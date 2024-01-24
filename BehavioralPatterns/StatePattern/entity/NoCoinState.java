package BehavioralPatterns.StatePattern.entity;

import BehavioralPatterns.StatePattern.context.VendingMachine;

public class NoCoinState implements VendingMachineState {
    @Override
    public void insertCoin(VendingMachine context) {
        System.out.println("Coin inserted.");
        context.setState(new HasCoinState());
    }

    @Override
    public void selectItem(VendingMachine context) {
        System.out.println("Please insert a coin first.");
    }

    @Override
    public void dispenseItem(VendingMachine context) {
        System.out.println("Please insert a coin and select an item.");
    }
}
