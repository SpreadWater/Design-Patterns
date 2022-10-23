package com.company;

import com.company.interfaces.Display;
import com.company.subjects.WeatherData;

import java.util.Observable;
import java.util.Observer;

public class NewCurrentConditionDisplay implements Observer, Display {
    Observable observable;
    private float temp;
    private float humidity;

    public NewCurrentConditionDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current condition" + temp + "F degrees and" + humidity + "% humidity");
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof NewWeatherData) {
            NewWeatherData newWeatherData = (NewWeatherData) o;
            this.temp = newWeatherData.getTemp();
            this.humidity = newWeatherData.getHumidity();
            display();
        }
    }
}
