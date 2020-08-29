package behavioral.observer.notification;

import behavioral.observer.weather.WeatherForecast;

public interface Observer {
  void updateForecastWeather(WeatherForecast weatherForecast);

}