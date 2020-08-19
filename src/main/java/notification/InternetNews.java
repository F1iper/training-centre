package notification;

import weather.WeatherForecast;

public class InternetNews implements Observer {
    @Override
    public void updateForecastWeather(WeatherForecast weatherForecast) {
        System.out.println("INTERNET NEWS -> Temperature: " + weatherForecast.getTemperature() +
                ", pressure: " + weatherForecast.getPressure());
    }
}
