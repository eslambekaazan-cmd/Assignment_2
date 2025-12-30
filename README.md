# Vehicle Management System

## A. Project Overview

The Vehicle Management System is a simple Java program created to demonstrate
basic object-oriented programming concepts.  
The main goal of this project is to show how inheritance, abstraction, and
composition work together in a real example.

The project uses an abstract Vehicle class and several subclasses.
Each vehicle has a driver, which shows the relationship between Vehicle and Driver.
Polymorphism is demonstrated by storing different vehicles in a Vehicle array.

---

## B. Class Hierarchy

### Superclass
Vehicle is an abstract class that contains common fields such as brand and year.
It also declares abstract methods startEngine() and stopEngine(), which must be
implemented by all subclasses.

### Subclasses
- Car  
- Motorcycle  
- Truck  

Each subclass extends Vehicle and provides its own implementation of
startEngine() and stopEngine() methods.

### Access Modifiers
- protected is used for fields in Vehicle so subclasses can access them
- private is used for subclass fields to protect data
- public is used for methods that must be accessed from other classes

---

## C. Instructions to Compile and Run

To compile all Java files:javac *.java
To run the program:java Main
---

## D. Screenshots

Below is the program output showing that vehicles and drivers work correctly.

---

## E. Reflection

Inheritance helped simplify the design because common properties and methods
were placed in the Vehicle class. This avoided code duplication and made the
program easier to understand.

Method overriding allowed each vehicle type to have its own behavior for
starting and stopping the engine. One challenge was understanding when to use
protected and private access modifiers, but after practice it became clearer
how they control access to class fields.
