package com.pattern.creational.prototype.solution1ShallowCopy;

public class GameBotCharacters implements GameClonable {
    private String name;
    private int health;
    private int attackPower;

    // this constructor is expensive to create a new character
    // so here it will be going to load only once.
    public GameBotCharacters(String name, int health, int attackPower) {

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
    }

    //1. Copy constructor for cloning
    private GameBotCharacters(GameBotCharacters original) {
        this.name = original.name;
        this.health = original.health;
        this.attackPower = original.attackPower;
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
}
