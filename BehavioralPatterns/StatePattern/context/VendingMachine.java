package BehavioralPatterns.StatePattern.context;

import BehavioralPatterns.StatePattern.entity.NoCoinState;
import BehavioralPatterns.StatePattern.entity.VendingMachineState;

public class VendingMachine {
    private VendingMachineState currentState;

    public VendingMachine() {
        // Initial state is NoCoinState
        currentState = new NoCoinState();
    }

    public void setState(VendingMachineState state) {
        currentState = state;
    }

    public void insertCoin() {
        currentState.insertCoin(this);
    }

    public void selectItem() {
        currentState.selectItem(this);
    }

    public void dispenseItem() {
        currentState.dispenseItem(this);
    }

}
