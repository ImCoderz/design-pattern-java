# Decorator Pattern

## Overview

This repository illustrates the Decorator Pattern, a structural design pattern that attaches additional responsibilities to an object dynamically. It provides a flexible alternative to subclassing for extending functionality.

## UML Diagram

![Decorator Pattern UML Diagram](https://github.com/ImCoderz/design-pattern-java/blob/main/assets/DecoratorUML.png)

## Description

The Decorator Pattern is useful when:
- You need to add functionalities to objects dynamically.
- Subclassing is impractical or leads to a class explosion.

## Usage

To use the Decorator Pattern, follow these general steps:

1. Define a component interface that declares the common interface for all concrete classes.
2. Create concrete components implementing the component interface.
3. Define a decorator class that implements the component interface and has a component instance.
4. Create concrete decorators that add new functionalities to the component.

## Example

Consider a window system where you want to add functionalities like scroll bars or borders dynamically. The Decorator Pattern allows you to attach these functionalities to windows without creating an excessive number of subclasses.

---