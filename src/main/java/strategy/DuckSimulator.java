package strategy;

import strategy.fly.FlyRocketPower;

public class DuckSimulator {
    public static void main(String[] args) {
        Duck duck = new MallardDuck();
        duck.perfofmQuack();
        duck.performFly();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPower());
        model.performFly();
    }
}
