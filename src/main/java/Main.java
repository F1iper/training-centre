import notification.InternetNews;
import notification.RadioNews;
import notification.TvNews;
import weather.WeatherForecast;

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

        weatherForecast.unregisterObserver(radioNews);

        weatherForecast.changeWeather(new WeatherForecast(42, 900));
    }
}
