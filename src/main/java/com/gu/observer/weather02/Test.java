package com.gu.observer.weather02;

import java.util.ArrayList;

/**
 * @author gu
 * @date 2020/6/14 21:36
 */
public class Test {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData(new ArrayList<>());

        Observer currentConditionDisplay = new CurrentConditionalDisplay(weatherData);
        Observer forecastDisplay = new ForecastDisplay(weatherData);
        Observer statisticsDisplay = new StatisticsDisplay(weatherData);

        System.out.println("天气改变：");
        weatherData.setMeasurements(26,70,97);
        System.out.println("天气再次改变：");
        weatherData.setMeasurements(23,88,100);

        weatherData.removeObserver(forecastDisplay);

        System.out.println("观察者中移除预报模板，天气改变：");
        weatherData.setMeasurements(26,70,97);
        System.out.println("观察者中移除预报模板，天气再次改变：");
        weatherData.setMeasurements(23,88,100);
    }
}
