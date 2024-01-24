# State Pattern

## Overview

This repository illustrates the State Pattern, a behavioral design pattern that allows an object to alter its behavior when its internal state changes. The object will appear to change its class.

## UML Diagram

![State Pattern UML Diagram](https://github.com/ImCoderz/design-pattern-java/blob/main/assets/StateUML.png)

## Description

The State Pattern is a behavioral pattern that addresses the following scenarios:
- Modeling an object's behavior based on its internal state.
- Encapsulating state-specific behavior in separate classes.
- Allowing an object to change its behavior at runtime by changing its internal state.

## Usage

### Steps to Use the State Pattern:

1. **Define the Context:**
   - Create a context class that maintains an internal state.
   - Define methods in the context class that delegate behavior to the current state.

2. **Define the State:**
   - Create an interface or abstract class for the state.
   - Define methods in the state class that represent state-specific behavior.

3. **Implement Concrete States:**
   - Implement concrete state classes that extend the state interface or class.
   - Each concrete state class should encapsulate the behavior associated with a specific state.

4. **Context Uses States:**
   - In the context class, maintain a reference to the current state.
   - Delegate state-specific behavior to the current state.

5. **Change State at Runtime:**
   - Allow the context class to change its internal state at runtime.
   - This change should result in the context using a different concrete state.

## Example

Consider a vending machine that dispenses different items based on its current state (has money, item selected, etc.).

### Usage Example:

```java
// Create a vending machine
VendingMachine vendingMachine = new VendingMachine();

// Vending machine in "NoMoneyState"
vendingMachine.selectItem("Chips"); // Display: "Please insert money"

// Insert money
vendingMachine.insertMoney(2.0); // Vending machine in "HasMoneyState"
vendingMachine.selectItem("Chips"); // Dispensing "Chips"

// Change state to "NoSelectionState"
vendingMachine.selectItem("Soda"); // Display: "Please insert money"
