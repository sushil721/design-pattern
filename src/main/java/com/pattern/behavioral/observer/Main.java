package com.pattern.behavioral.observer;

public class Main {
    static void main() {

        YoutubeSubscriber subscriber1 = new YoutubeSubscriber("Sushil", 1);
        YoutubeSubscriber subscriber2 = new YoutubeSubscriber("Surendra", 2);
        YoutubeSubscriber subscriber3 = new YoutubeSubscriber("Aman", 3);
        YoutubeSubscriber subscriber4 = new YoutubeSubscriber("Shambhu", 4);
        YoutubeSubscriber subscriber5 = new YoutubeSubscriber("Murari", 5);

        Sushil721Channel sushil721Channel = new Sushil721Channel();
        sushil721Channel.subscribe(subscriber1);
        sushil721Channel.subscribe(subscriber2);
        sushil721Channel.subscribe(subscriber3);
        sushil721Channel.subscribe(subscriber4);
        sushil721Channel.subscribe(subscriber5);

        //sushil721Channel.uploadVideo("Design Pattern", "design_pattern.mp4");

        InstagramSubscriber iSubscriber1 = new InstagramSubscriber("Sushil", 1);
        InstagramSubscriber iSubscriber2 = new InstagramSubscriber("Surendra", 2);

        sushil721Channel.subscribe(iSubscriber1);
        sushil721Channel.subscribe(iSubscriber2);

        sushil721Channel.uploadVideo("Design Pattern", "Design-Pattern.mp4");

    }
}
