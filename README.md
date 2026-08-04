# Java design-pattern
### Types of design patterns:
#### Referense: https://github.com/TheCuriousCoder-sg/design-patterns (Changes branch and see all patterns step by step)

## 1. Creational Design Pattern: <h4>Factory, Factory Method, Abstract Factory, Builder, Prototype. </h4>
## 2. Structural Design Pattern: <h4>Adapter, Bridge, Composite, Decorator, Facade, Flyweight, Proxy. </h4>
## 3. Behavioral Design Pattern: <h4>Chain of Responsibility, Command, Interpreter, Iterator, Mediator, Memento, Observer, State, Strategy, Template Method, Visitor.</h4>

### 1. Creational Design Pattern:
#### **a.** Factory Pattern: Defines an interface for creating objects without exposing the object creation logic to the client.

_Limitations:_ It is breaking single responsibility principle and Open close principle because of only fixed type of Notification object we creating like, EmailNotification and SmsNotification.

#### **b.** Factory Method Pattern: Defines an interface for creating objects, and allows subclasses to decide which concrete object create.

#### **c.** Abstract Factory Pattern: Defines an Interface for creating families of objects without specifying their concrete classes. (Factory of factory patterns)

#### **d.** Builder Pattern: It is a design pattern that help us to create complex objects step by step or easily, by keeping the object creation process flexible, readable, and maintainable. Insted of passing a huge parameters of an object, we can use/build the object using builder pattern to create it in multiple steps.

