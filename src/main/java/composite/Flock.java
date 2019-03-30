package composite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Observer;

public class Flock implements Quackable {

    ArrayList quackers = new ArrayList();

    public void add(Quackable duck) {
        quackers.add(duck);
    }

    public void quack() {
        Iterator iterator = quackers.iterator();
        while (iterator.hasNext()) {
            Quackable quacker = (Quackable) iterator.next();
            quacker.quack();
        }
    }

    public void registerObserver(Observer observer) {

    }

    public void registerObserver(composite.Observer observer) {

    }

    public void notifyObservers() {

    }
}
