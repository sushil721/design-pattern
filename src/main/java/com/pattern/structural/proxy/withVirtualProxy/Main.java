package com.pattern.structural.proxy.withVirtualProxy;

public class Main {
    static void main() throws InterruptedException {
        Video video1 = new MovieProxy("Shashank_Redemption.mp4");
        Video video2 = new MovieProxy("Golmal.mp4");
        Video video3 = new MovieProxy("Spiderman.mp4");

        video1.play();
        video2.play();
        video3.play();
    }
}
