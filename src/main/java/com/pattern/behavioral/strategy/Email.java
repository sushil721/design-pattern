package com.pattern.behavioral.strategy;

public class Email extends Notification{

    public Email(EncryptionStrategy encryptionStrategy, CompressionStrategy compressionStrategy) {
        super(encryptionStrategy, compressionStrategy);
    }

    @Override
    public void send() {
        IO.println("Sending Email.");
    }

/*    @Override
    public void encrypt() {
        IO.println("AES Encryption.");
    }

    @Override
    public void compress() {
        IO.println("Zip Compression.");
    }*/
}
