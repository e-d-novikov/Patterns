package composite;

public class Quackologist implements Observer {
    public void update(QuackOservable duck) {
        System.out.println("Quackologist: " + duck + " just quacked.");
    }
}
