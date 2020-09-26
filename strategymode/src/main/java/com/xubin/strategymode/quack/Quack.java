package com.xubin.strategymode.quack;

public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        //呱呱叫
        System.out.println("呱呱叫");
    }
}
