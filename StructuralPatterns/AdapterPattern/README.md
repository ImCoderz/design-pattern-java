# Adapter Pattern

## Overview

This repository illustrates the Adapter Pattern, a structural design pattern that allows incompatible interfaces to work together. It acts as a bridge between two incompatible interfaces, converting the interface of a class into another interface that a client expects.

## UML Diagram

![Adapter Pattern UML Diagram](https://github.com/ImCoderz/design-pattern-java/blob/main/assets/AdapterUML.png)

## Description

The Adapter Pattern is useful in scenarios where:
- You have legacy code or third-party libraries with interfaces that are incompatible with your current system.
- You want to reuse existing classes that have incompatible interfaces.

## Usage

To use the Adapter Pattern, follow these general steps:

1. Identify the incompatible interfaces that need to work together.
2. Create an adapter class that implements the target interface.
3. Inside the adapter class, use composition to integrate an instance of the existing class (adaptee).
4. Implement the target interface methods in the adapter class, delegating calls to the adaptee.

## Example

Suppose you have a system that expects a `NewPaymentProcessor` interface, but you want to use a legacy `OldPaymentProcessor` class. The Adapter Pattern allows you to create an adapter class that makes the `OldPaymentProcessor` compatible with the `NewPaymentProcessor` interface.

---

