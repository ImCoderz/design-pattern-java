# Memento Pattern

## Overview

This repository illustrates the Memento Pattern, a behavioral design pattern that provides the ability to capture and restore an object's internal state. It is often used to implement undo functionality or to save and restore the state of an object.

## UML Diagram

![Memento Pattern UML Diagram](https://github.com/ImCoderz/design-pattern-java/blob/main/assets/MementoUML.png)

## Description

The Memento Pattern is a behavioral pattern that addresses the following scenarios:
- Capturing and externalizing an object's internal state.
- Providing a mechanism to undo changes or restore an object to a previous state.

## Usage

### Steps to Use the Memento Pattern:

1. **Define the Originator:**
   - Create an originator class that holds the internal state of an object.
   - Define methods to set and get the state.
   - Implement a method to create a memento object capturing the current state.

2. **Define the Memento:**
   - Create a memento class that represents the state of the originator.
   - The memento should allow the originator to restore its state.

3. **Implement the Caretaker:**
   - Create a caretaker class that keeps track of mementos.
   - The caretaker is responsible for storing and retrieving mementos.

4. **Originator Uses Memento:**
   - In the originator, use the memento to capture and restore the state.
   - The originator should be able to create a memento, set its state, and restore its state from a memento.

5. **Caretaker Manages Mementos:**
   - The caretaker is responsible for managing the collection of mementos.
   - It can store mementos in a list, allowing for undo functionality.

## Example

Consider a text editor that allows users to undo and redo their text changes.

