package composite;

import composite.ducks.DuckCall;
import composite.ducks.MallardDuck;
import composite.ducks.ReadHeadDuck;
import composite.ducks.RubberDuck;

public class CountingDuckFactory extends AbstractDuckFactory {

    public Quackable createMallardDuck() {
        return new QuackConuter(new MallardDuck());
    }

    public Quackable createRedHeadDuck() {
        return new QuackConuter(new ReadHeadDuck());
    }

    public Quackable createDuckCall() {
        return new QuackConuter(new DuckCall());
    }

    public Quackable createRubberDuck() {
        return new QuackConuter(new RubberDuck());
    }
}
