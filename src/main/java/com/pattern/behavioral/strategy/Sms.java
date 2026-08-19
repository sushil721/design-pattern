package com.pattern.behavioral.strategy;

public class Sms extends Notification{

    public Sms(EncryptionStrategy encryptionStrategy, CompressionStrategy compressionStrategy) {
        super(encryptionStrategy, compressionStrategy);
    }

    @Override
    public void send() {
        IO.println("Sending SMS.");
    }

 /*   @Override
    public void encrypt() {
        IO.println("AES Encryption.");
    }

    @Override
    public void compress() {
        IO.println("GZIP Compression.");
    }*/
}
