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
#### **c.** Proxy Pattern: It is a structural design pattern that provides a placeholder (Representative Object) for another object. it is a structural design pattern that provides a surrogate or placeholder for another object to control access to it. It is used when we want to control access to an object, or when we want to add additional functionality to an object without changing its code.
_Example:_ Client -> Proxy -> Real Object
_Types of Proxies Patterns:_ 1. Virtual Proxy, 2. Protection Proxy, 3. Remote Proxy, 4. Smart Proxy.
_Note-1:_ We have to do Lazy initialization of Real Object in Proxy class, so that we can create the Real Object only when it is required. It will save memory and time.
_Note-1:_ And we have to make sure that loading part will be done only once, so we have to use synchronized block to make it thread safe.

### 3. Behavioral Design Pattern: Defines the way objects interact with each other and how they communicate. It provides a way to define the behavior of objects and how they interact with each other, making it easier to build complex systems.
#### **a.** Observer Pattern: It is a behavioral design pattern where one object automatically notifies multiple other objects whenever any change or any event occurs in the state of that object. It is a behavioral design pattern that allows us to define a one-to-many dependency between objects, so that when one object changes state, all its dependents are notified and updated automatically. It is used when we want to create a system where multiple objects need to be notified of changes in another object.
_Example:_ A YouTube/Instagram channel (Subject) notifies multiple subscribers (Observers) whenever a new video is published. The subscribers can then update their own state (Comment/like) based on the new information/notification.

#### **b.** Strategy Pattern: It is a behavioral design pattern that allows us to define a family of algorithms, encapsulate each one, and make them interchangeable. It is used when we want to define a set of algorithms that can be used interchangeably, without changing the code that uses them.

#### **c.** Chain of Responsibility Pattern: It is a behavioral design pattern that allows us to pass a request along a chain of handlers, where each handler can either handle the request or pass it to the next handler in the chain. It is used when we want to decouple the sender of a request from its receivers, allowing multiple objects to handle the request without knowing which object will handle it. 
_Note:_ A customer support system where a request can be handled by different support agents based on their expertise. The request is passed along the chain of agents until it is handled by the appropriate agent.
_Example-1:_ Client -> Chatot -> Customer Executive -> Tech Team. If the request is not resolve by the Chatbot, it can be escalated to a Customer Executive, and if the Customer Executive cannot handle the request, it can be escalated to the Tech Team.
_Example-2:_ if a request is for a technical issue, it can be handled by a technical support agent, while a billing issue can be handled by a billing support agent. If the request cannot be handled by any of the agents, it can be escalated to a higher level of support.
