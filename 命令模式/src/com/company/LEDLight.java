package com.company;

public class LEDLight extends Light{
    @Override
    void on() {
        System.out.println("LED ON!");
    }

    @Override
    void off() {
        System.out.println("LED OFF!");
    }
}
