package composite;

public class GooseAdapter implements Quackable {

    Goose goose;
    Observable observable;

    public GooseAdapter(Goose goose, Observable observable) {
        this.goose = goose;
        this.observable = observable;
    }

    public void quack() {
        goose.honk();
    }
    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }

    public void notifyObservers() {
        observable.notifyObservers();
    }
}
