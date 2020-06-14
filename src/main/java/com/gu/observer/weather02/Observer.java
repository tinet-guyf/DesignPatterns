package com.gu.observer.weather02;

/**
 * @author gu
 * @date 2020/6/14 18:01
 * 观察者
 */
public interface Observer {
    /**
     * 气象值改变时主题会调用该方法，三个参数应该封装成一个类
     * @param temperature
     * @param humidity
     * @param pressure
     */
    void update(float temperature, float humidity, float pressure);
}
