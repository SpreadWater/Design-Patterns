package com.company.behavior;

import com.company.interfaces.QuackBehavior;

public class Quack implements QuackBehavior {
    @Override
    public void Quack() {
        System.out.println("普通的叫Quack");
    }
}
