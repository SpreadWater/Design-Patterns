package com.company;

import com.company.interfaces.FlyBehavior;
import com.company.interfaces.QuackBehavior;

public abstract class Duck {
    public FlyBehavior flyBehavior;
    public QuackBehavior quackBehavior;

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    // 抽象的展示方法
    public abstract void display();

    public void performFly(){
        flyBehavior.Fly();
    }

    public void performQuack(){
        quackBehavior.Quack();
    }
}
