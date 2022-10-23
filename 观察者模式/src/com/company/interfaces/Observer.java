package com.company.interfaces;

public interface Observer {
    // 感觉这个方法的耦合性有点高,观察者只是观察者，不负责具体业务。。
    void update(float temp, float humidity, float pressure);
}
