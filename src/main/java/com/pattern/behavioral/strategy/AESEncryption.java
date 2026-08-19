package com.pattern.behavioral.strategy;

public class AESEncryption implements EncryptionStrategy{
    @Override
    public void encrypt() {
        IO.println("AES Encryption.");
    }
}
