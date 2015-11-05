package classwork.patterns.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by CCowalsky on 05.11.2015.
 */
public class WeatherStatistic {
    List<Integer> temperatures = new ArrayList<>();
    List<Integer> hamdidities = new ArrayList<>();
    List<Integer> pressures = new ArrayList<>();

    public void set(int temperature,int humdity, int pressure) {
        temperatures.add(temperature);
        hamdidities.add(humdity);
        pressures.add(pressure);
    }

    public void display(){
        System.out.println("temperature: " + temperatures+", humidity: "+hamdidities+", pressure: "+pressures);
    }
}
