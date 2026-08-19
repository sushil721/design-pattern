package com.pattern.behavioral.strategy;

public class RSAEncryption implements EncryptionStrategy{
    @Override
    public void encrypt() {
        IO.println("RSA Encryption.");
    }
}
