# Composite Pattern

## Overview

This repository illustrates the Composite Pattern, a structural design pattern that composes objects into tree structures to represent part-whole hierarchies. It allows clients to treat individual objects and compositions of objects uniformly.

## UML Diagram

![Composite Pattern UML Diagram](https://github.com/ImCoderz/design-pattern-java/blob/main/assets/CompositeUML.png)

## Description

The Composite Pattern is useful when:
- You want clients to treat individual objects and compositions of objects uniformly.
- You need to represent part-whole hierarchies of objects.

## Usage

To use the Composite Pattern, follow these general steps:

1. Define a component interface that declares the common interface for all concrete classes.
2. Implement leaf components (individual objects) and composite components (compositions).
3. The client interacts with components through the common interface, treating them uniformly.

## Example

Consider a graphics system where shapes (circles, rectangles) can be combined to create complex structures. The Composite Pattern allows you to treat individual shapes and compositions of shapes uniformly.

---






