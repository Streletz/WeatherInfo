package streletzcoder.weatherinfo.network;

import android.os.AsyncTask;

import java.util.ArrayList;
import java.util.Vector;

import streletzcoder.weatherinfo.OpenWeatherMap;
import streletzcoder.weatherinfo.WeatherInfo;

/**
 * Created by Стрелец Coder on 03.12.2015.
 * AsyncTask для получения данных о погоде
 */
public class HttpTask extends AsyncTask<String, Void, ArrayList<WeatherInfo>> {


    @Override
    protected ArrayList<WeatherInfo> doInBackground(String... params) {
        OpenWeatherMap owm = new OpenWeatherMap(params);
        return owm.getWeatherArray();
    }
}
