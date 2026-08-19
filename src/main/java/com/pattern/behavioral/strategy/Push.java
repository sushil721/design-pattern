package com.pattern.behavioral.strategy;

public class Push extends Notification{

    public Push(EncryptionStrategy encryptionStrategy, CompressionStrategy compressionStrategy) {
        super(encryptionStrategy, compressionStrategy);
    }

    @Override
    public void send() {
        IO.println("Sending Push Notification.");
    }

   /* @Override
    public void encrypt() {
        IO.println("RSA Encryption.");
    }

    @Override
    public void compress() {
        IO.println("ZIP Compression.");
    }*/
}
