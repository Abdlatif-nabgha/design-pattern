package comportement.observerpattern;


public class WeatherApp {

    static void main() {
        WeatherStation weatherStation = new WeatherStation();

        Observer phoneDisplay = new PhoneDisplay();
        Observer tvDisplay = new TVDisplay();

        weatherStation.addObserver(phoneDisplay);
        weatherStation.addObserver(tvDisplay);

        weatherStation.setWeather("Sunny");
        weatherStation.setWeather("Rainy");
        weatherStation.setWeather("Cloudy");

        weatherStation.removeObserver(tvDisplay);
        weatherStation.setWeather("Windy");
    }
}
