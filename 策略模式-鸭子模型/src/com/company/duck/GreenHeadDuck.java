package com.company.duck;

import com.company.Duck;
import com.company.behavior.Fly;
import com.company.behavior.Quack;

public class GreenHeadDuck extends Duck {

    public GreenHeadDuck() {
        flyBehavior = new Fly();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("我是绿头鸭--------");
    }
}
