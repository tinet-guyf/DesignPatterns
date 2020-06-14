package com.gu.observer.weather01;

/**
 * @author gu
 * @date 2020/6/14 17:13
 * 气象数据
 */
public class WeatherData {

    private float temperature;

    private float humidity;

    private float pressure;

    private CurrentConditionalDisplay currentConditionalDisplay;
    private StatisticsDisplay statisticsDisplay;
    private  ForecastDisplay forecastDisplay;

    /**
     * 当气象测量更新时，该方法会被调用;
     * 方法里面调用了每个布告板的update方法
     *
     */
    public void measurementsChanged(){

        float temperature = getTemperature();
        float humidity = getHumidity();
        float pressure = getPressure();
        currentConditionalDisplay.update(temperature,humidity,pressure);
        statisticsDisplay.update(temperature,humidity,pressure);
        forecastDisplay.update(temperature,humidity,pressure);

    }

    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }

    public float getPressure() {
        return pressure;
    }

    public void setPressure(float pressure) {
        this.pressure = pressure;
    }
}
