package BehavioralPatterns.StatePattern;

import BehavioralPatterns.StatePattern.context.VendingMachine;

public class BuyItem {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine();
        vendingMachine.insertCoin(); // Coin inserted.
        vendingMachine.selectItem(); // Item selected.
        vendingMachine.dispenseItem(); // Item dispensed. Enjoy your purchase!

        vendingMachine.selectItem(); // Please insert a coin first.
        vendingMachine.dispenseItem(); // Please select an item first.
    }
  
}
