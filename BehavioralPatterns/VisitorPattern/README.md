# Visitor Pattern

## Overview

This repository illustrates the Visitor Pattern, a behavioral design pattern that lets you define a new operation without changing the classes of the elements on which it operates. It separates algorithms from the objects on which they operate.

## UML Diagram

![Visitor Pattern UML Diagram](https://github.com/ImCoderz/design-pattern-java/blob/main/assets/VisitorUML.png)

## Description

The Visitor Pattern is a behavioral pattern that addresses the following scenarios:
- Defining a new operation on a set of related classes without modifying those classes.
- Keeping related operations grouped in a separate visitor class.
- Allowing the addition of new operations without modifying existing classes.

## Usage

### Steps to Use the Visitor Pattern:

1. **Define the Element Interface:**
   - Create an interface or abstract class that declares the `accept` method.
   - The `accept` method takes a visitor as a parameter and allows the visitor to operate on the element.

2. **Implement Concrete Elements:**
   - Create concrete classes that implement the element interface.
   - Each concrete class represents an element on which the visitor can operate.

3. **Define the Visitor Interface:**
   - Create an interface or abstract class for the visitor.
   - Declare methods for each concrete element that the visitor can visit.

4. **Implement Concrete Visitors:**
   - Create concrete classes that implement the visitor interface.
   - Each concrete visitor provides a specific operation for each concrete element.

5. **Elements Accept Visitors:**
   - In each concrete element class, implement the `accept` method.
   - The `accept` method should call the corresponding method in the visitor, passing itself as a parameter.

6. **Clients Use Visitors:**
   - Clients create instances of concrete visitors and pass them to elements.
   - Elements call the `accept` method, allowing visitors to operate on them.

## Example

Consider a shape hierarchy where different shapes can be visited by area and perimeter calculators.

### Usage Example:

```java
// Create shapes
Shape circle = new Circle(5);
Shape rectangle = new Rectangle(4, 6);

// Create visitors
AreaCalculator areaCalculator = new AreaCalculator();
PerimeterCalculator perimeterCalculator = new PerimeterCalculator();

// Calculate area and perimeter for shapes
circle.accept(areaCalculator);
circle.accept(perimeterCalculator);

rectangle.accept(areaCalculator);
rectangle.accept(perimeterCalculator);
