# Chain of Responsibility Pattern

## Overview

This repository illustrates the Chain of Responsibility Pattern, a behavioral design pattern that passes requests along a chain of handlers. Each handler decides either to process the request or to pass it along to the next handler in the chain.

## UML Diagram

![Chain of Responsibility Pattern UML Diagram](https://github.com/ImCoderz/design-pattern-java/blob/main/assets/ChainOfResponsibilityUML.png)

## Description

The Chain of Responsibility Pattern is a behavioral pattern that addresses the following scenarios:
- A system contains multiple handlers that can process a request.
- The handlers are organized in a chain.
- A request is passed along the chain until a handler decides to process it.
- Each handler in the chain has the option to either handle the request or pass it to the next handler.

## Example

Consider a purchase approval workflow in a company where different managers have different levels of authority to approve purchase requests.

## Comparison with Other Patterns

- **Observer Pattern:**
  - The Chain of Responsibility Pattern focuses on handling a request through a chain of handlers, while the Observer Pattern defines a one-to-many dependency between objects, notifying them of changes.

- **Decorator Pattern:**
  - The Chain of Responsibility Pattern allows multiple handlers to process a request, while the Decorator Pattern adds new responsibilities to an object dynamically.


