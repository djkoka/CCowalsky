package classwork.patterns.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by CCowalsky on 05.11.2015.
 */
public class WeatherStatistic implements WeatherObserver {
    List<Integer> temperatures = new ArrayList<>();
    List<Integer> hamidities = new ArrayList<>();
    List<Integer> pressures = new ArrayList<>();

    public void updateWeather(WeatherStation station) {
        temperatures.add(station.getTemperature());
        hamidities.add(station.getHumidity());
        pressures.add(station.getPressure());
    }

    public void display(){
        System.out.println("temperature: " + temperatures+", humidity: "+hamidities+", pressure: "+pressures);
    }
}
