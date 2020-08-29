package behavioral.observer.notification;


import behavioral.observer.weather.WeatherForecast;

public class TvNews implements Observer{
    @Override
    public void updateForecastWeather(WeatherForecast weatherForecast) {
        System.out.println("TvNews -> Temperature: " + weatherForecast.getTemperature() +
                ", pressure: " + weatherForecast.getPressure());
    }
}