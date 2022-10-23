package com.company;

import com.company.behavior.FlyRocketPowered;
import com.company.duck.GreenHeadDuck;
import com.company.duck.RedHeadDuck;

public class Main {

    public static void main(String[] args) {
        Duck greenDuck = new GreenHeadDuck();
        Duck redDuck = new RedHeadDuck();

        // 默认的鸭子行为
        greenDuck.performFly();
        greenDuck.performQuack();
        greenDuck.display();

        redDuck.performFly();
        redDuck.performQuack();
        redDuck.display();

        // 设置的鸭子行为，多用组合少用继承，通过组合去配置适当的行为对象，而不是通过继承去获取鸭子的行为。
        redDuck.setFlyBehavior(new FlyRocketPowered());
        redDuck.performFly();
    }
}
