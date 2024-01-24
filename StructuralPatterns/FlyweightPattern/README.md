# Flyweight Pattern

## Overview

This repository illustrates the Flyweight Pattern, a structural design pattern that minimizes memory usage or computational expenses by sharing resources with related objects. It is particularly useful when a large number of similar objects need to be created.

## UML Diagram

![Flyweight Pattern UML Diagram](https://github.com/ImCoderz/design-pattern-java/blob/main/assets/FlyweightUML.png)

## Description

The Flyweight Pattern is useful when:
- You need to create a large number of similar objects.
- The state of objects can be shared, and extrinsic state can be separated.

## Usage

To use the Flyweight Pattern, follow these general steps:

1. Identify shared and non-shared states in the objects.
2. Create a flyweight interface that declares methods for accessing and manipulating shared states.
3. Create concrete flyweight classes that implement the flyweight interface.
4. Create a flyweight factory to manage and create flyweight objects.

## Example

Consider a text editor where you have a large number of characters with similar fonts. The Flyweight Pattern allows you to share the font information (shared state) among characters efficiently.

---
