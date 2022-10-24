package com.company.beverage;

public abstract class Beverage {
    String description = "Unknown Description";

    public String getDescription(){
        return this.description;
    }
    // 抽象方法cost
    public abstract double cost();
}
