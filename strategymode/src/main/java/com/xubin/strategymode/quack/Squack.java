package com.xubin.strategymode.quack;

public class Squack implements QuackBehavior {
    @Override
    public void quack() {
        //吱吱叫
        System.out.println("吱吱叫");
    }
}
