package composite;

import java.util.ArrayList;
import java.util.Iterator;

public class Observable implements QuackOservable {

    ArrayList observers = new ArrayList();
    QuackOservable duck;

    public Observable(QuackOservable duck) {
        this.duck = duck;
    }

    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    public void notifyObservers() {
        Iterator iterator = observers.iterator();
        while (iterator.hasNext()) {
            Observer observer = (Observer) iterator.next();
            observer.update(duck);
        }
    }
}
