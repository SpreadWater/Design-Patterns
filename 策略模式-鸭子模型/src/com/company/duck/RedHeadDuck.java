package com.company.duck;

import com.company.Duck;
import com.company.behavior.Fly;
import com.company.behavior.MuteQuack;

public class RedHeadDuck extends Duck {

    public RedHeadDuck() {
        flyBehavior = new Fly();
        quackBehavior = new MuteQuack();
    }

    @Override
    public void display() {
        System.out.println("我是红头鸭");
    }
}
