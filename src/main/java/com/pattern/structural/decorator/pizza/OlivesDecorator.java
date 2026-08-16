package com.pattern.structural.decorator.pizza;

public class OlivesDecorator extends PizzaDecorator{

    public OlivesDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription()+ ", Olive";
    }

    @Override
    public int getCost() {
        return pizza.getCost()+80;
    }
}
