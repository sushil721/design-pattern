package com.pattern.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class Sushil721Channel {

    private String videoTitle;
    private String videoFileName;
    List<Subscriber> subscriberList = new ArrayList<>();

    public void subscribe(Subscriber subscriber){
        subscriberList.add(subscriber);
    }

    public void notifySubscriber(){
        for (Subscriber subscriber: subscriberList){
            subscriber.update(this);
        }
    }

    public void uploadVideo(String videoTitle, String videoFileName){
        this.videoTitle = videoTitle;
        this.videoFileName = videoFileName;
        IO.println("Video '"+ videoTitle +"' has been uploaded.");
        notifySubscriber();
    }

    public String getVideoTitle() {
        return videoTitle;
    }

    public String getVideoFileName() {
        return videoFileName;
    }
}
