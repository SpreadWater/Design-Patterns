package com.company.behavior;

import com.company.interfaces.FlyBehavior;

public class Fly implements FlyBehavior {
    @Override
    public void Fly() {
        System.out.println("普通飞行Fly");
    }
}
