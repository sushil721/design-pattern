package com.pattern.structural.decorator.pizza;

//PlainPizza
public class MarghretaPizza implements Pizza{

    @Override
    public String getDescription() {
        return "Margherita Pizza";
    }

    @Override
    public int getCost() {
        return 200;
    }
}
