package com.gu.observer.weather01;

/**
 * @author gu
 * @date 2020/6/14 17:25
 */
public class ForecastDisplay {
    public void update(float temperature, float humidity, float pressure){
        System.out.println("ForecastDisplay: temperature = [" + temperature + "], humidity = [" + humidity + "], pressure = [" + pressure + "]");
    }
}
