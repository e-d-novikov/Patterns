package strategy;

import strategy.fly.FlyBehavior;
import strategy.quack.QuackBehavior;

public abstract class Duck {

    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public void display() {
        System.out.println("Duck");
    }

    public void swim() {
        System.out.println("Swim");
    }

    public void performFly() {
        flyBehavior.fly();
    }

    public void perfofmQuack() {
        quackBehavior.quack();
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
