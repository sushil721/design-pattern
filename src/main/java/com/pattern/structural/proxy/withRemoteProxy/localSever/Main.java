package com.pattern.structural.proxy.withRemoteProxy.localSever;

import com.pattern.structural.proxy.withRemoteProxy.remoteServer.Weather;
import com.pattern.structural.proxy.withRemoteProxy.remoteServer.WeatherServer;

public class Main {
    static void main() {
        Weather weather = new WeatherProxy(new WeatherServer());
        IO.println(weather.getWeather());
    }
}
