package com.pattern.structural.decorator.pizza;

public class Main {
    static void main() {
        Pizza pizza = new MarghretaPizza();
        IO.println("Description: "+pizza.getDescription() +" :: Cost: "+pizza.getCost());

        //Add Cheeze doping on my Marghreta Pizza.
        pizza = new CheezeDecorator(pizza);
        IO.println("Description: "+pizza.getDescription() +" :: Cost: "+pizza.getCost());

        //Add Olive doping on my Pizza.
        pizza = new OlivesDecorator(pizza);
        IO.println("Description: "+pizza.getDescription() +" :: Cost: "+pizza.getCost());

        //Add Mushroom doping on my Marghreta Pizza.
        pizza = new MushroomDecorator(pizza);
        IO.println("Description: "+pizza.getDescription() +" :: Cost: "+pizza.getCost());

    }
}
