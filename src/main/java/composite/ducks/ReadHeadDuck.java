package composite.ducks;

import composite.Observable;
import composite.Observer;
import composite.Quackable;

public class ReadHeadDuck implements Quackable {

    Observable observable;

    public ReadHeadDuck() {
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
