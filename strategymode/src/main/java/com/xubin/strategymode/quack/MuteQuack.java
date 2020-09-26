package com.xubin.strategymode.quack;

public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        //不会叫
        System.out.println("不会叫");
    }
}
