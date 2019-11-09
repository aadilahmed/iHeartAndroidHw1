package com.iheartradio.android.hw1;

import com.airbren.android.weather.api.WeatherResponse;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * For more information https://openweathermap.org/api
 * Example:
 *
 * Current weather
 * https://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22
 *
 * Weather Forecast
 * https://samples.openweathermap.org/data/2.5/forecast?q=London,us&mode=xml&appid=b6907d289e10d714a6e88b30761fae22
 *
 */

public class WeatherApi {

    private final String WEATHER_API_END_POINT = "https://openweathermap.org";
    private final String SAMPLE_API_KEY = "b6907d289e10d714a6e88b30761fae22";

    private final WeatherApiService weatherApiService
            = new Retrofit.Builder()
            .baseUrl(WEATHER_API_END_POINT)
            .addConverterFactory(GsonConverterFactory.create())
            .build().create(WeatherApiService.class);

    public Call<WeatherResponse> getCurrentWeather(String query) {
        return weatherApiService.getCurrentWeather(query, SAMPLE_API_KEY);
    }
}
