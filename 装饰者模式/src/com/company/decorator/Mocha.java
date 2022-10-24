package com.company.decorator;

import com.company.beverage.Beverage;

public class Mocha extends CondimentDecorator {
    // 此处持有beverage的引用，用来委托和记录被装饰者,用于递归操作！！！
    Beverage beverage;
    // 实例化的时候，传入被装饰者对象
    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return 0.2 + beverage.cost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ",Mocha";
    }
}
