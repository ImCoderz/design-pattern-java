# Mediator Pattern

## Overview

This repository illustrates the Mediator Pattern, a behavioral design pattern that defines an object that centralizes communication between a set of objects, allowing them to interact without being directly coupled. It promotes a loose coupling between the components of a system by encapsulating their interactions within a mediator object.

## UML Diagram

![Mediator Pattern UML Diagram](https://github.com/ImCoderz/design-pattern-java/blob/main/assets/MediatorUML.png)

## Description

The Mediator Pattern is a behavioral pattern that addresses the following scenarios:
- Centralizing communication between objects in a system.
- Promoting loose coupling by encapsulating object interactions.
- Simplifying object interactions by removing direct connections.

## Usage

### Steps to Use the Mediator Pattern:

1. **Define the Mediator Interface:**
   - Create an interface that declares methods for communication between objects. This is often referred to as the `Mediator` interface.

2. **Implement the Concrete Mediator:**
   - Create a concrete class that implements the mediator interface.
   - This class will manage the communication between different objects.

3. **Define Colleague Interface:**
   - Create an interface for objects that will interact with each other through the mediator. This is often referred to as the `Colleague` interface.

4. **Implement Concrete Colleagues:**
   - Create concrete classes that implement the colleague interface.
   - These classes will have a reference to the mediator and will use it to communicate with other colleagues.

5. **Create and Add Colleagues to the Mediator:**
   - Instantiate concrete colleagues and add them to the mediator.
   - The mediator will manage the collection of colleagues.

6. **Colleagues Communicate Through the Mediator:**
   - Colleagues should communicate with each other only through the mediator.
   - The mediator will handle the details of the communication.

## Considerations

- The Mediator Pattern simplifies communication between objects by centralizing it in a mediator.
- It helps to avoid direct connections between multiple objects, promoting a more maintainable and extensible system.
- Be mindful of the complexity of the mediator, and ensure that it remains focused on coordinating communication.

Feel free to customize the README to suit your specific implementation and examples.
