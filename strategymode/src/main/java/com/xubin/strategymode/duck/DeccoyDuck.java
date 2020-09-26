package com.xubin.strategymode.duck;

public class DeccoyDuck extends Duck {
    @Override
    public void display() {
        System.out.println("看起来像诱饵鸭");
    }
}
