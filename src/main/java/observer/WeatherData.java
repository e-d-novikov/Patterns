package observer;

import observer.displays.Observer;

import java.util.ArrayList;

public class WeatherData implements Subject {

    private ArrayList<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        observers = new ArrayList<Observer>();
    }

    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        int index = observers.indexOf(observer);
        if (index >= 0) {
            observers.remove(index);
        }
    }

    public void notifyObserver() {
        for (Observer observer : observers) {
            observer.update(this.temperature, this.humidity, this.pressure);
        }
    }

    public void mesurementChanged() {
        notifyObserver();
    }

    public void setMesurments(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        mesurementChanged();
    }
}
