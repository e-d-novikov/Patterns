package composite.ducks;

import composite.Observable;
import composite.Observer;
import composite.Quackable;

public class RubberDuck implements Quackable {

    Observable observable;

    public RubberDuck() {
        this.observable = new Observable(this);
    }

    public void quack() {
        System.out.println("Squeck");
    }

    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }

    public void notifyObservers() {
        observable.notifyObservers();
    }
}
