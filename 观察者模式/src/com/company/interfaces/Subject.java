package com.company.interfaces;

public interface Subject {
    // Observer去调用
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    // 此处可以把Observer的List传入，也可以不传入，因为真正的ObserverList是由其实现类管理持有的。
    void notifyObservers();
}
