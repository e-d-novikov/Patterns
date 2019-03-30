package composite;

public class QuackConuter implements Quackable {

    Quackable duck;
    static int numberOfQuacks;

    public QuackConuter(Quackable duck) {
        this.duck = duck;
    }

    public void quack() {
        duck.quack();
        numberOfQuacks++;
    }

    public static int getQuacks() {
        return numberOfQuacks;
    }

    public void registerObserver(Observer observer) {

    }

    public void notifyObservers() {

    }
}
