package com.iheartradio.android.hw1;

import com.airbren.android.weather.api.WeatherResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

interface WeatherApiService {

    /**
     *
     * @param query
     * @param appid
     * @return current weather
     */
    @GET("/data/2.5/weather")
    Call<WeatherResponse> getCurrentWeather(@Query("q") String query,
                                            @Query("appid") String appid);

    /**
     *
     * @param query
     * @param appid
     * @return 5 days of weather forecast
     */
    @GET("/data/2.5/forecast")
    Call<WeatherResponse> getWeatherForecast(@Query("q") String query,
                                             @Query("appid") String appid);

}
