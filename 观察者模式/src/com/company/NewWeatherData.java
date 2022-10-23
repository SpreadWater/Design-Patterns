package com.company;

import java.util.Observable;

public class NewWeatherData extends Observable {
    private float temp;
    private float humidity;
    private float pressure;

    public NewWeatherData() {
    }

    private void measureMentChanged() {
        setChanged();
        // 观察者从可观察者中拉取数据
        notifyObservers();
    }
    public void setMeasureMents(float temp, float humidity, float pressure){
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        System.out.println("-----------------可观察在更新数据------------");
        measureMentChanged();
    }

    public float getTemp() {
        return temp;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
