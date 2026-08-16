package com.pattern.structural.proxy.withRemoteProxy.localSever;

import com.pattern.structural.proxy.withRemoteProxy.remoteServer.Weather;
import com.pattern.structural.proxy.withRemoteProxy.remoteServer.WeatherServer;

public class WeatherProxy implements Weather {
    
    private Weather weather;

    public WeatherProxy(Weather weather) {
        this.weather = weather; //new WeatherServer();
    }

    @Override
    public String getWeather() {
        authenticate();
        openConnection();
        serializeRequest();
        return sendHttpRequest();
    }

    private void authenticate() {
        IO.println("Authenticating...");
    }

    private void openConnection() {
        IO.println("Opening Connection...");
    }

    private void serializeRequest() {
        IO.println("Serializing Request...");
    }

    private String sendHttpRequest() {
        IO.println("Sending HTTP Request...");
        return weather.getWeather();
    }

}
