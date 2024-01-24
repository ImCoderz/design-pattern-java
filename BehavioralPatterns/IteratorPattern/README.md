# Iterator Pattern

## Overview

This repository illustrates the Iterator Pattern, a behavioral design pattern that provides a way to access the elements of a collection without exposing its underlying representation. It defines an interface for accessing elements sequentially without exposing the internal structure of the collection.

## UML Diagram

![Iterator Pattern UML Diagram](https://github.com/ImCoderz/design-pattern-java/blob/main/assets/IteratorUML.png)

## Description

The Iterator Pattern is a behavioral pattern that addresses the following scenarios:
- Accessing elements of a collection without exposing its internal structure.
- Providing a uniform way to traverse various types of collections.

## Usage

To use the Iterator Pattern, follow these general steps:

1. Define an iterator interface with methods like `hasNext` and `next`.
2. Implement concrete iterator classes for specific collections.
3. Define an aggregate (collection) interface that declares the method for creating an iterator.
4. Implement concrete aggregate classes that maintain a collection of elements.
5. Clients use iterators to traverse elements without knowing the underlying structure.

## Example

Consider a library with a collection of books. The Iterator Pattern allows clients to traverse through the books without exposing the internal structure of the library.
