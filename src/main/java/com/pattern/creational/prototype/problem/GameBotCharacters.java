package com.pattern.creational.prototype.problem;

public class GameBotCharacters {
    private String name;
    private int health;
    private int attackPower;

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

    @Override
    public String toString() {
        return "GameBotCharacters{" +
                "name='" + name + '\'' +
                ", health=" + health +
                ", attackPower=" + attackPower +
                '}';
    }
}
