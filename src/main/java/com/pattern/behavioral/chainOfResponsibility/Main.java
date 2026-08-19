package com.pattern.behavioral.chainOfResponsibility;

public class Main {
    static void main() {

        Client client = new Client(new Chatbot(new CustomerExecutive(new TechTeam())));

        //Client client = new Client(new CustomerExecutive(new TechTeam()));
        //Client client = new Client(new Chatbot(new TechTeam()));
        //Client client = new Client(new CustomerExecutive( new Chatbot(new TechTeam())));

        // Test-1
        //client.raiseIssue(new Issue("LEVEL1", "INITIATED"));

        // Test-2
        //client.raiseIssue(new Issue("LEVEL2", "INITIATED"));

        // Test-3
        client.raiseIssue(new Issue("LEVEL3", "INITIATED"));

        // Test-4
        //client.raiseIssue(new Issue("LEVEL4", "INITIATED"));
    }
}
