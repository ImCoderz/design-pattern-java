# Bridge Pattern

## Overview

This repository illustrates the Bridge Pattern, a structural design pattern that separates abstraction from implementation, allowing both to evolve independently. It involves a bridge interface that decouples an abstraction from its implementation, providing flexibility in designing complex systems.

## UML Diagram

![Bridge Pattern UML Diagram](https://github.com/ImCoderz/design-pattern-java/blob/main/assets/BridgeUML.png)

## Description

The Bridge Pattern is beneficial when:
- You want to avoid a permanent binding between an abstraction and its implementation.
- Changes in the implementation should not affect clients using the abstraction.

## Usage

To use the Bridge Pattern, follow these general steps:

1. Identify an abstraction and its potential variations.
2. Create an abstraction interface and implementer interface (abstraction and implementation).
3. Include a bridge interface that acts as a link between abstraction and implementation.
4. Clients interact with the abstraction through the bridge interface.

## Example

Consider a scenario where you have different shapes (abstraction) and drawing methods (implementation). The Bridge Pattern allows you to represent each shape independently while allowing them to be drawn in different ways.
