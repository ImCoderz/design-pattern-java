# Facade Pattern

## Overview

This repository illustrates the Facade Pattern, a structural design pattern that provides a unified interface to a set of interfaces in a subsystem. It makes it easier to use and reduces dependencies between subsystems.

## UML Diagram

![Facade Pattern UML Diagram](https://github.com/ImCoderz/design-pattern-java/blob/main/assets/FacadeUML.png)

## Description

The Facade Pattern is beneficial when:
- You want to provide a simple interface to a complex subsystem.
- You need to reduce dependencies between clients and subsystems.

## Usage

To use the Facade Pattern, follow these general steps:

1. Identify a complex subsystem with multiple interfaces.
2. Create a facade class that provides a simplified interface to the subsystem.
3. Clients interact with the facade, which delegates calls to the subsystem.

## Example

Consider a computer system with various subsystems like CPU, Memory, and Disk. The Facade Pattern allows you to create a ComputerFacade that simplifies interactions for clients, hiding the complexities of individual subsystems.

---