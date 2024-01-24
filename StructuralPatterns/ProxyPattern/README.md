# Proxy Pattern

## Overview

This repository illustrates the Proxy Pattern, a structural design pattern that provides a surrogate or placeholder for another object to control access to it. It can be used for various purposes, including controlling access, implementing lazy loading, or providing a level of indirection.

## UML Diagram

![Proxy Pattern UML Diagram](https://github.com/ImCoderz/design-pattern-java/blob/main/assets/ProxyUML.png)

## Description

The Proxy Pattern is beneficial when:
- You want to control access to an object.
- You need to add functionalities like lazy loading or logging without modifying the actual object.

## Usage

To use the Proxy Pattern, follow these general steps:

1. Define a subject interface that declares common operations for both the real subject and proxy.
2. Create a real subject class that implements the subject interface.
3. Create a proxy class that also implements the subject interface, controlling access or adding functionalities as needed.

## Example

Consider a situation where you want to control access to a sensitive resource. The Proxy Pattern allows you to create a proxy that authenticates and authorizes access before allowing the client to interact with the real subject.

