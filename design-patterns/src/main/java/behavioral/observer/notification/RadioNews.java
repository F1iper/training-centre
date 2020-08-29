package behavioral.observer.notification;

import behavioral.observer.weather.WeatherForecast;

public class RadioNews implements Observer {
    @Override
    public void updateForecastWeather(WeatherForecast weatherForecast) {
        System.out.println("RadioNews -> Temperature: " + weatherForecast.getTemperature() +
                ", pressure: " + weatherForecast.getPressure());
    }
}