package com.pattern.creational.prototype.solution2DeepCopy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        GameBotCharacters gbc1 = new GameBotCharacters("Bot01", 100, 0, new ArrayList<>(Arrays.asList("Rifle")));
        GameBotCharacters gbc2 = gbc1.gameClone();
        gbc2.setName("Bot02");
        GameBotCharacters gbc3 = gbc1.gameClone();
        gbc3.setName("Bot03");
        GameBotCharacters gbc4 = gbc1.gameClone();
        gbc4.setName("Bot04");
        GameBotCharacters gbc5 = gbc1.gameClone();
        gbc5.setName("Bot05");
        List<String> weaponsForGbc5 = new ArrayList<>(gbc5.getWeapons());
        weaponsForGbc5.add("Sniper");
        gbc5.setWeapons(weaponsForGbc5);

        System.out.println(gbc1);
        System.out.println(gbc2);
        System.out.println(gbc3);
        System.out.println(gbc4);
        System.out.println(gbc5);

        long endTime = System.currentTimeMillis();
        System.out.println("Time taken to create 5 GameBotCharacters objects: " + (endTime - startTime) + " milliseconds");
        // It is taking only 2003 milliseconds (2 seconds) to create 5 GameBotCharacters objects because the gameClone() method creates a copy of the existing object, which is much faster than creating a new object from scratch. This is an example of the Prototype design pattern, which allows for efficient object creation by cloning existing objects.
    }
}
