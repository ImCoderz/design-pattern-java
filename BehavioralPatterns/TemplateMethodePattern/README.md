# Template Method Pattern

## Overview

This repository illustrates the Template Method Pattern, a behavioral design pattern that defines the skeleton of an algorithm in the superclass but lets subclasses override specific steps of the algorithm without changing its structure.

## UML Diagram

![Template Method Pattern UML Diagram](https://github.com/ImCoderz/design-pattern-java/blob/main/assets/TemplateMethodUML.png)

## Description

The Template Method Pattern is a behavioral pattern that addresses the following scenarios:
- Defining the steps of an algorithm in a superclass.
- Allowing subclasses to customize certain steps of the algorithm.
- Ensuring that the overall structure of the algorithm remains unchanged.

## Usage

### Steps to Use the Template Method Pattern:

1. **Define the Abstract Class:**
   - Create an abstract class that declares the template method.
   - The template method defines the steps of the algorithm and may include some steps with default implementations.

2. **Declare Abstract Steps:**
   - Declare some steps of the algorithm as abstract methods in the abstract class.
   - These steps represent points where subclasses can customize the behavior.

3. **Implement Concrete Steps:**
   - Implement some steps of the algorithm in the abstract class with default behavior.
   - These steps are common to all subclasses.

4. **Override Abstract Steps in Subclasses:**
   - Subclasses extend the abstract class and override the abstract steps.
   - Each subclass provides its own implementation for the specific steps it wants to customize.

5. **Call Template Method:**
   - Clients use the template method to execute the algorithm.
   - The template method calls the steps of the algorithm, including the abstract steps overridden by subclasses.

## Example

Consider a coffee-making process where the overall process is defined in a template method, but specific steps like brewing and adding condiments can be customized by subclasses.

### Usage Example:

```java
// Create a coffee template
CoffeeTemplate coffee = new Coffee();

// Make a regular coffee
coffee.makeCoffee(); // Output: Boiling water, Brewing coffee grounds, Pouring coffee into cup, Adding sugar and milk

// Create a tea template
TeaTemplate tea = new Tea();

// Make a green tea
tea.makeTea(); // Output: Boiling water, Steeping the tea, Pouring tea into cup, Adding lemon
