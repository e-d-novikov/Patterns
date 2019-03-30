package composite.ducks;

import composite.Observable;
import composite.Observer;
import composite.Quackable;

public class MallardDuck implements Quackable {

    Observable observable;

    public MallardDuck() {
        this.observable = new Observable(this);
    }

    public void quack() {
        System.out.println("quack");
    }

    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }

    public void notifyObservers() {
        observable.notifyObservers();
    }
}
