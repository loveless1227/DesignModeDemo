package com.xubin.strategymode.duck;

import com.xubin.strategymode.fly.FlyBehavior;
import com.xubin.strategymode.quack.QuackBehavior;

public abstract class Duck {

    //MallardDuck 绿头鸭  RedHeadDuck 红头鸭  RubberDuck 橡皮鸭  DeccoyDuck 诱饵鸭
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Duck() {
    }

    public abstract void display();

    public void performFly(){
        flyBehavior.fly();
    }

    public void performQuack(){
        quackBehavior.quack();
    }

    public void setFlyBehavior(FlyBehavior flyBehavior){
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior){
        this.quackBehavior = quackBehavior;
    }

}
