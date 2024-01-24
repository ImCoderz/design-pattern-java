package BehavioralPatterns.StatePattern.entity;

import BehavioralPatterns.StatePattern.context.VendingMachine;

public interface VendingMachineState {
    void insertCoin(VendingMachine context);
    void selectItem(VendingMachine context);
    void dispenseItem(VendingMachine context);
}
