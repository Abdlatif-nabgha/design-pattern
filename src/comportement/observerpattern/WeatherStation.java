package comportement.observerpattern;


import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Subject {

    private final List<Observer> observers = new ArrayList<>();
    private String weather;

    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer o : observers) {
            o.update(weather);
        }
    }
    public void setWeather(String weather) {
        this.weather = weather;
        notifyObservers();
    }
}
