package com.company.subjects;

import com.company.interfaces.Observer;
import com.company.interfaces.Subject;

import java.util.ArrayList;

public class WeatherData implements Subject {
    private final ArrayList<Observer> observers;
    private float temp;
    private float humidity;
    private float pressure;

    public WeatherData() {
        this.observers = new ArrayList<Observer>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
        System.out.println(observer + "------------注册成功-------------");
    }

    @Override
    public void removeObserver(Observer observer) {
        int i = observers.indexOf(observer);
        if (i >= 0) {
            observers.remove(i);
        }
    }

    @Override
    public void notifyObservers() {
        for (int i = 0; i < observers.size(); i++) {
            Observer observer = (Observer) observers.get(i);
            System.out.println("------------通知Observer" + i + "-------------");
            observer.update(temp, humidity, pressure);
        }
    }

    private void measureMentChanged() {
        notifyObservers();
    }

    // 用于上层调用更新函数
    public void setMeasureMent(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        System.out.println("-----------------Subject更新数据------------");
        measureMentChanged();
    }
}
