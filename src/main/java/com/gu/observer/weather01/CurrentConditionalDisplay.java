package com.gu.observer.weather01;

/**
 * @author gu
 * @date 2020/6/14 17:18
 * 展示当前气象的布告板
 */
public class CurrentConditionalDisplay {

    public void update(float temperature, float humidity, float pressure){
        System.out.println("CurrentConditionalDisplay: temperature = [" + temperature + "], humidity = [" + humidity + "], pressure = [" + pressure + "]");
    }
}
