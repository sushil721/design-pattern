package com.pattern.creational.prototype.solution2DeepCopy;

import java.util.List;

public class GameBotCharacters implements GameClonable {
    private String name;
    private int health;
    private int attackPower;
    //Adding a mutable new field (because List is mutable) for deep copy
    private List<String> weapons;

    // this constructor is expensive to create a new character
    // so here it will be going to load only once.
    public GameBotCharacters(String name, int health, int attackPower, List<String> weapons) {

        //Expensive operation to create a new character
        System.out.println("Loading character animation from disk....");
        System.out.println("Loading  sound from disk....");
        System.out.println("Loading  character details from DB....");
        System.out.println("Preparing AI battle setting file....");

        try{
            Thread.sleep(2000);
        }catch (InterruptedException e){
            System.out.println(e.getMessage());
        }

        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
        this.weapons = weapons;
    }

    //1. Copy constructor for cloning
    private GameBotCharacters(GameBotCharacters original) {
        this.name = original.name;
        this.health = original.health;
        this.attackPower = original.attackPower;

        //this is a shallow copy of the mutable field, so we need to create a new list and copy the elements from the original list to the new list.
        //this.weapons = original.weapons;
        // Make Deep copy of the mutable field
        this.weapons = List.copyOf(original.weapons);
    }
    //2. Implementing the clone method from GameClonable interface
    @Override
    public GameBotCharacters gameClone() {
        return new GameBotCharacters(this);
    }

    @Override
    public String toString() {
        return "GameBotCharacters{" +
                "name='" + name + '\'' +
                ", health=" + health +
                ", attackPower=" + attackPower +
                ", weapons=" + weapons +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHealth(int health ) {
        this.health = health;
    }

    public void setAttackPower( int attackPower ) {
        this.attackPower = attackPower;
    }

    public void setWeapons(List<String> weapons) {
        this.weapons = weapons;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public List<String> getWeapons() {
        return weapons;
    }
}
