package observer;

import observer.displays.CurrentConditionsDisplay;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);

        weatherData.setMesurments(80, 65, 30);
        weatherData.setMesurments(82, 64, 32);
        weatherData.setMesurments(70, 61, 36);
    }
}
