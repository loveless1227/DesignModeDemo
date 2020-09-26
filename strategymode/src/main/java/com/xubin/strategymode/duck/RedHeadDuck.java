package com.xubin.strategymode.duck;

import com.xubin.strategymode.fly.FlyWithWings;
import com.xubin.strategymode.quack.Quack;

public class RedHeadDuck extends Duck {

    public RedHeadDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("看起来像红头鸭");
    }
}
