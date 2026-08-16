package com.pattern.structural.proxy.withVirtualProxy;

public class Movies implements Video{

    private String fileName;

    public Movies(String fileName) throws InterruptedException {
        this.fileName = fileName;
        // if we are going to load an expensive operation.
        // it will take a lot of time to create this object.
        loadVideo(fileName);
    }

    @Override
    public void play() {
        IO.println("Video is playing "+ fileName);
    }

    public void loadVideo(String fileName) throws InterruptedException {
        IO.println("Loading "+fileName+" from server....");
        Thread.sleep(5000); // just for demo of expensive operation
    }
}
