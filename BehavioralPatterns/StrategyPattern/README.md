# Strategy Pattern

## Overview

This repository illustrates the Strategy Pattern, a behavioral design pattern that defines a family of algorithms, encapsulates each algorithm, and makes them interchangeable. It lets the algorithm vary independently from clients that use it.

## UML Diagram

![Strategy Pattern UML Diagram](https://github.com/ImCoderz/design-pattern-java/blob/main/assets/StrategyUML.png)

## Description

The Strategy Pattern is a behavioral pattern that addresses the following scenarios:
- Defining a family of algorithms.
- Encapsulating each algorithm in a separate class.
- Making algorithms interchangeable without changing the client that uses them.

## Usage

### Steps to Use the Strategy Pattern:

1. **Define the Context:**
   - Create a context class that contains a reference to a strategy interface.
   - The context class delegates the algorithm to the strategy.

2. **Define the Strategy Interface:**
   - Create an interface or abstract class for the strategy.
   - Declare a method that represents the algorithm.

3. **Implement Concrete Strategies:**
   - Implement concrete strategy classes that extend the strategy interface.
   - Each concrete strategy class encapsulates a different algorithm.

4. **Context Uses a Strategy:**
   - In the context class, maintain a reference to the current strategy.
   - Delegate the algorithm to the strategy.

5. **Change Strategy at Runtime:**
   - Allow the context class to change its strategy at runtime.
   - This change should result in the context using a different concrete strategy.

## Example

Consider a sorting algorithm where the choice of sorting strategy can be changed dynamically.

### Usage Example:

```java
// Create a sorting context
SortingContext sortingContext = new SortingContext();

// Use bubble sort strategy
sortingContext.setSortingStrategy(new BubbleSort());
sortingContext.sort(new int[]{5, 2, 8, 1, 6}); // Output: 1 2 5 6 8

// Use quicksort strategy
sortingContext.setSortingStrategy(new QuickSort());
sortingContext.sort(new int[]{5, 2, 8, 1, 6}); // Output: 1 2 5 6 8
