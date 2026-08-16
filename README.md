# Java design-pattern
### Types of design patterns:
#### Referense: https://github.com/TheCuriousCoder-sg/design-patterns (Changes branch and see all patterns step by step)
#### Youtube: https://www.youtube.com/watch?v=VNyyC2IOvFo


## 1. Creational Design Pattern: <h4>Factory, Factory Method, Abstract Factory, Builder, Singleton, Prototype. </h4>
## 2. Structural Design Pattern: <h4>Adapter, Bridge, Composite, Decorator, Facade, Flyweight, Proxy. </h4>
## 3. Behavioral Design Pattern: <h4>Chain of Responsibility, Command, Interpreter, Iterator, Mediator, Memento, Observer, State, Strategy, Template Method, Visitor.</h4>

### 1. Creational Design Pattern:
#### **a.** Factory Pattern: Defines an interface for creating objects without exposing the object creation logic to the client.

_Limitations:_ It is breaking single responsibility principle and Open close principle because of only fixed type of Notification object we creating like, EmailNotification and SmsNotification.

#### **b.** Factory Method Pattern: Defines an interface for creating objects, and allows subclasses to decide which concrete object create.

#### **c.** Abstract Factory Pattern: Defines an Interface for creating families of objects without specifying their concrete classes. (Factory of factory patterns)

#### **d.** Builder Pattern: It is a design pattern that help us to create complex objects step by step or easily, by keeping the object creation process flexible, readable, and maintainable. Instead of passing a huge parameters of an object, we can use/build the object using builder pattern to create it in multiple steps.

#### **e.** Singleton Pattern: it ensures that only a single object of a class exists throughout the entire application and provides a global point of access to that object. It is used when we want to restrict the instantiation of a class to one object.

#### **f.** Prototype Pattern: it is a design pattern that allows us to create new objects by coping existing objects, rather than creating new instances from scratch. It is used when we want to create a new object that is similar to an existing object, but with some modifications.
_Copy Constructor:_ it creates a new object by copying the values of an existing object.

### 2. Structural Design Pattern: These are the design patterns that deal with how classes and onjects are organized to form larger structures. It provides a way to create relationships between classes and objects, making it easier to build complex systems.
#### **a.** Adapter Pattern: It is a structural design pattern that allow two incompatible system ot interfaces to work together. it is a design pattern that allows us to convert the interface of a class into another interface that the client expects. It is used when we want to use an existing class that has a different interface than the one we need.
#### **b.** Decorator Pattern: it is a structural design pattern that allow us to add new behaviour or features to an object dynamically. It is a structural design pattern that allows us to add new functionality to an existing object without changing its structure. It is used when we want to add new behavior to an object at runtime, without modifying its code.
_Note-1:_ It allows us to wrap an existing object and keep adding new features or behaviour dynamically at runtime.
_Example-1:_ Order a PIZZA and add extra toppings like cheese, mushrooms, etc. without changing the original pizza class.
_Example-2:_ Hotel room booking system, where we can add extra features like breakfast, spa, minibar etc. without changing the original room class.
_Note-2:_ Put Debugger in main and Decoder classes and go through the code to understand how it works.


