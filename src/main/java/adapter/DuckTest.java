package adapter;

import adapter.duck.Duck;
import adapter.duck.MallardDuck;
import adapter.turkey.WildTurkey;

public class DuckTest {
    public static void main(String[] args) {
        MallardDuck mallardDuck = new MallardDuck();

        WildTurkey wildTurkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(wildTurkey);

        testDuck(mallardDuck);
        testDuck(turkeyAdapter);
    }

    public static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }
}
