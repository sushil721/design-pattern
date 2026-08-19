package com.pattern.behavioral.strategy;

public class GZipCompression implements CompressionStrategy{
    @Override
    public void compress() {
        IO.println("GZIP Compression.");
    }
}
