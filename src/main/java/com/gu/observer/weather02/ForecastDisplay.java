package com.gu.observer.weather02;

/**
 * @author gu
 * @date 2020/6/14 17:25
 */
public class ForecastDisplay implements Observer,DisplayElement{

    private float temperature;
    private float humidity;
    private float pressure;
    // 保留subject的引用，当想要主动注销时比较方便，在自身添加一个注销方法调用weatherData的注销方法即可
    private final Subject weatherData;

    public ForecastDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        // 将自己注册到主题
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }

    @Override
    public void display() {
        System.out.println("ForecastDisplay: temperature = [" + temperature + "], humidity = [" + humidity + "], pressure = [" + pressure + "]");
    }

}
