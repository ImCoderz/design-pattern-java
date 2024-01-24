# Observer Pattern

## Overview

This repository illustrates the Observer Pattern, a behavioral design pattern that defines a one-to-many dependency between objects, so that when one object changes its state, all its dependents are notified and updated automatically.

## UML Diagram

![Observer Pattern UML Diagram](https://github.com/ImCoderz/design-pattern-java/blob/main/assets/ObserverUML.png)

## Description

The Observer Pattern is a behavioral pattern that addresses the following scenarios:
- Establishing a dependency between a subject (observable) and multiple observers.
- Notifying observers about changes in the state of the subject.
- Supporting a loosely coupled design where the subject and observers are independent.

## Usage

### Steps to Use the Observer Pattern:

1. **Define the Subject (Observable):**
   - Create an interface or abstract class for the subject (observable) that declares methods to attach, detach, and notify observers.
   - Implement concrete subject classes that maintain a list of observers.

2. **Define the Observer:**
   - Create an interface or abstract class for the observer that declares the update method.
   - Concrete observers implement this update method to respond to changes in the subject.

3. **Attach and Detach Observers:**
   - In the concrete subject, implement methods to attach (subscribe) and detach (unsubscribe) observers.
   - Maintain a collection of observers in the subject.

4. **Notify Observers:**
   - When the state of the subject changes, call the notify method to inform all attached observers.
   - This method typically calls the update method on each observer.

5. **Concrete Subject Implementation:**
   - Implement concrete subject classes that extend the subject interface or class.
   - Define methods to update the state of the subject.

6. **Concrete Observer Implementation:**
   - Implement concrete observer classes that extend the observer interface or class.
   - Implement the update method to respond to changes in the subject.

## Example

Consider a stock market application where multiple investors want to be notified when the price of a particular stock changes.

### Usage Example:

```java
// Create a stock (subject)
Stock stock = new Stock("ABC", 100.0);

// Create investors (observers)
Investor investor1 = new Investor("Investor 1");
Investor investor2 = new Investor("Investor 2");

// Attach investors to the stock
stock.addObserver(investor1);
stock.addObserver(investor2);

// Change the stock price
stock.setPrice(110.0);
