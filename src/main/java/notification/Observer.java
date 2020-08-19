package notification;

import weather.WeatherForecast;

public interface Observer{
    void updateForecastWeather(WeatherForecast weatherForecast);

}
