package com.company.behavior;

import com.company.interfaces.FlyBehavior;

public class FlyRocketPowered implements FlyBehavior {
    @Override
    public void Fly() {
        System.out.println("火箭飞行--------");
    }
}
