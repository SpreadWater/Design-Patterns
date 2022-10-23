package com.company;

import com.company.subjects.CurrentConditionDisplay;
import com.company.subjects.ForecastDisplay;
import com.company.subjects.StatisticsDisplay;
import com.company.subjects.WeatherData;

public class Main {

    public static void main(String[] args) {
//        WeatherData weatherData = new WeatherData();
//        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);
//        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
//        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
//
//        weatherData.setMeasureMent(80,65,30.4f);
        NewWeatherData newWeatherData = new NewWeatherData();
        NewCurrentConditionDisplay newCurrentConditionDisplay = new NewCurrentConditionDisplay(newWeatherData);
        newWeatherData.setMeasureMents(10,20,30.4f);
    }
}