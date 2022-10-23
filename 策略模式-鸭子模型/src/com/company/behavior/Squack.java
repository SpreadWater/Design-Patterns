package com.company.behavior;

import com.company.interfaces.QuackBehavior;

public class Squack implements QuackBehavior {
    @Override
    public void Quack() {
        System.out.println("Sequack叫——--------------");
    }
}
