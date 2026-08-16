package com.pattern.behavioral.observer;

public class InstagramSubscriber implements Subscriber{
    private String name;
    private int id;
    private String platform;

    public InstagramSubscriber(String name, int id) {
        this.name = name;
        this.id = id;
        this.platform = "Instagram";
    }

    public void update(Sushil721Channel channel){
        IO.println("Uploaded "+this.platform+" video Title: "+ channel.getVideoTitle() +", file name: "+ channel.getVideoFileName() +" Received notification by "+this.name+", Id: "+this.id);
    }
}
