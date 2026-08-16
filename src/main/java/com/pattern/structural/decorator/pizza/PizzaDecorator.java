package com.pattern.structural.decorator.pizza;

//This Decorator class has IS-A and HAS-A relationship both with Pizz.
// This class is abstract class so it is not going to implement Pizza's methods.
// its child classes will go to implements those methods of Pizza interface.
// implements Pizza : it is an IS-A relationship.
public abstract class PizzaDecorator implements Pizza{

    //Has-A relationship.
    Pizza pizza;

    public PizzaDecorator(Pizza pizza) {
        this.pizza = pizza;
    }
}
