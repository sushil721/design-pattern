package com.pattern.behavioral.strategy;

public abstract class Notification {
    abstract void send();
/*    void encrypt();
    void compress();*/
    EncryptionStrategy encryptionStrategy;
    CompressionStrategy compressionStrategy;

    public Notification(EncryptionStrategy encryptionStrategy, CompressionStrategy compressionStrategy) {
        this.encryptionStrategy = encryptionStrategy;
        this.compressionStrategy = compressionStrategy;
    }

    void encrypt(){
        encryptionStrategy.encrypt();
    }

    void compress(){
        compressionStrategy.compress();
    }
}
