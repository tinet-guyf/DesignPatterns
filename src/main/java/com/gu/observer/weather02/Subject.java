package com.gu.observer.weather02;

/**
 * @author gu
 * @date 2020/6/14 17:59
 * 主题
 */
public interface Subject {

    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObserver();
}
