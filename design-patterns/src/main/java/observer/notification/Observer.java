package observer.notification;

import observer.weather.WeatherForecast;

public interface Observer {
  void updateForecastWeather(WeatherForecast weatherForecast);

}