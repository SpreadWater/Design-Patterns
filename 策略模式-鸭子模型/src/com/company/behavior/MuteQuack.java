package com.company.behavior;

import com.company.interfaces.QuackBehavior;

public class MuteQuack implements QuackBehavior {
    @Override
    public void Quack() {
        System.out.println("Mute叫-------");
    }
}
