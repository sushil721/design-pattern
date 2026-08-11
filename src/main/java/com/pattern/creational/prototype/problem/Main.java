package com.pattern.creational.prototype.problem;

public class Main {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        GameBotCharacters gbc1 = new GameBotCharacters("Bot01", 100, 0);
        GameBotCharacters gbc2 = new GameBotCharacters("Bot02", 100, 0);
        GameBotCharacters gbc3 = new GameBotCharacters("Bot03", 100, 0);
        GameBotCharacters gbc4 = new GameBotCharacters("Bot04", 100, 0);
        GameBotCharacters gbc5 = new GameBotCharacters("Bot05", 100, 0);

        long endTime = System.currentTimeMillis();
        System.out.println("Time taken to create 5 GameBotCharacters objects: " + (endTime - startTime) + " milliseconds");
        // It is taking more time to create 5 GameBotCharacters objects because each object is created using the new keyword, which involves memory allocation and initialization for each object. This can be inefficient when creating a large number of similar objects.
        // total time taken to create 5 GameBotCharacters objects: 10007 milliseconds
    }
}
