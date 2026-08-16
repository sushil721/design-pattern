package com.pattern.structural.proxy.withoutProxy;

public class Main {
    static void main() throws InterruptedException {
        Video video1 = new Movies("Shashank_Redemption.mp4");
        Video video2 = new Movies("Golmal.mp4");
        Video video3 = new Movies("Spiderman.mp4");
    }
}
