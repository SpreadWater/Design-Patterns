package com.company.subjects;

import com.company.interfaces.Display;
import com.company.interfaces.Observer;
import com.company.interfaces.Subject;

public class StatisticsDisplay implements Observer, Display {
    private float temp;
    private float humidity;
    // 便于观察者取消注册。
    private Subject weatherData;

    public StatisticsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        // 注册此观察者
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Statistics Display" + temp + "F degrees and" + humidity + "% humidity");
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        System.out.println("Statistic Display 收到更新");
        display();
    }
}
