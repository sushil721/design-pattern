package com.pattern.behavioral.observer;

public class YoutubeSubscriber implements Subscriber{
    private String name;
    private int id;
    private String platform;

    public YoutubeSubscriber(String name, int id) {
        this.name = name;
        this.id = id;
        this.platform = "YouTube";
    }

    public void update(Sushil721Channel channel){
        IO.println("Uploaded "+this.platform+" video Title: "+ channel.getVideoTitle() +", file name: "+ channel.getVideoFileName() +" Received notification by "+this.name+", Id: "+this.id);
    }
}
