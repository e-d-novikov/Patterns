package composite.ducks;

import composite.Observable;
import composite.Observer;
import composite.Quackable;

public class DuckCall implements Quackable {

    Observable observable;

    public DuckCall() {
        this.observable = new Observable(this);
    }

    public void quack() {
        System.out.println("Kwak");
    }

    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }

    public void notifyObservers() {
        observable.notifyObservers();
    }
}
