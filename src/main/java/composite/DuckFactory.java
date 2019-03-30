package composite;

import composite.ducks.DuckCall;
import composite.ducks.MallardDuck;
import composite.ducks.ReadHeadDuck;
import composite.ducks.RubberDuck;

public class DuckFactory extends AbstractDuckFactory {

    public Quackable createMallardDuck() {
        return new MallardDuck();
    }

    public Quackable createRedHeadDuck() {
        return new ReadHeadDuck();
    }

    public Quackable createDuckCall() {
        return new DuckCall();
    }

    public Quackable createRubberDuck() {
        return new RubberDuck();
    }
}
