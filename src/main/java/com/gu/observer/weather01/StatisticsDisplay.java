package com.gu.observer.weather01;

/**
 * @author gu
 * @date 2020/6/14 17:24
 */
public class StatisticsDisplay {

    public void update(float temperature, float humidity, float pressure){
        System.out.println("StatisticsDisplay: temperature = [" + temperature + "], humidity = [" + humidity + "], pressure = [" + pressure + "]");
    }
}
