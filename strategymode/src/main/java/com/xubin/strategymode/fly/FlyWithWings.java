package com.xubin.strategymode.fly;

public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I am FlyWithWings");
    }
}
