package com.pattern.structural.proxy.withRemoteProxy.remoteServer;

public class WeatherServer implements Weather{

    @Override
    public String getWeather() {
        IO.println("Fetching Weather Data...");
        return "35 Degree Celsius.";
    }
}
