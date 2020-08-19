package observer;

import observer.notification.InternetNews;
import observer.notification.RadioNews;
import observer.notification.TvNews;
import observer.weather.WeatherForecast;

public class Main {
    public static void main(String[] args) {

        WeatherForecast weatherForecast = new WeatherForecast(25, 1003);

        TvNews tvNews = new TvNews();
        RadioNews radioNews = new RadioNews();
        InternetNews internetNews = new InternetNews();

        weatherForecast.registerObserver(tvNews);
        weatherForecast.registerObserver(radioNews);
        weatherForecast.registerObserver(internetNews);

        weatherForecast.notifyObservers();

        weatherForecast.unregisterObserver(tvNews);
        weatherForecast.unregisterObserver(internetNews);
        System.out.println("The storm is coming, new weather from radio news: " );
        weatherForecast.changeWeather(new WeatherForecast(22, 900));
    }
}
