package composite;

public interface QuackOservable {
    public void registerObserver(Observer observer);
    public void notifyObservers();
}
