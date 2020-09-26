package com.xubin.strategymode.fly;

public class FlyWithNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I cannot fly");
    }
}
