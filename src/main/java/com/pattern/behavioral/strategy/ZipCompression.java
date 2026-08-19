package com.pattern.behavioral.strategy;

public class ZipCompression implements CompressionStrategy{
    @Override
    public void compress() {
        IO.println("ZIP Compression.");
    }
}
