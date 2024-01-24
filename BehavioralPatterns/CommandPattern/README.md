# Command Pattern

## Overview

This repository illustrates the Command Pattern, a behavioral design pattern that turns a request into a standalone object, allowing users to parameterize clients with queues, requests, and operations.

## UML Diagram

![Command Pattern UML Diagram](https://github.com/ImCoderz/design-pattern-java/blob/main/assets/CommandUML.png)

## Description

The Command Pattern is a behavioral pattern that addresses the following scenarios:
- Encapsulates a request as an object, allowing for parameterization of clients.
- Enables the queuing of requests.
- Supports the implementation of undoable operations.

## Usage

To use the Command Pattern, follow these general steps:

1. Define a command interface with an `execute` method.
2. Implement concrete command classes that encapsulate specific operations.
3. Create receiver classes that perform the actual operations.
4. Optionally, implement an invoker class that triggers commands.
5. Configure and associate commands with invoker, if applicable.

## Considerations

- The Command Pattern can be used to implement undo and redo functionality.
- Care should be taken to properly design the command interfaces and classes.
- It promotes loose coupling between clients and receivers by encapsulating requests as objects.

Feel free to customize the README to suit your specific implementation and examples.
