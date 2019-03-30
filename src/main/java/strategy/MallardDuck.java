package strategy;

import strategy.fly.FlyWithWings;
import strategy.quack.Quack;

public class MallardDuck extends Duck {

    MallardDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    public void display() {
        System.out.println("I'm a real Mallard duck");
    }
}
