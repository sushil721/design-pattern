package com.pattern.structural.proxy.withVirtualProxy;

public class MovieProxy implements Video{

    private String fileName;
    private Video video;

    public MovieProxy(String fileName) {
        IO.println("Proxy Object created");
        this.fileName = fileName;
    }

    @Override
    public void play() throws InterruptedException {
        if(video == null) {
            video = new Movies(fileName);
        }
        video.play();
    }
}
