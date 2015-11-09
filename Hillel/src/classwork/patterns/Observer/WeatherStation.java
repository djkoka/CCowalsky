package classwork.patterns.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by CCowalsky on 05.11.2015.
 */
public class WeatherStation {
    private int temperature;
    private int humidity;
    private int pressure;

    List<WeatherObserver> observers = new ArrayList<>();

    public void measuremenChanged(){

        for (WeatherObserver observer: observers){
            observer.updateWeather(this);
        }
    }
    public void register(WeatherObserver observer){
        observers.add(observer);
    }
    public void removeObs(WeatherObserver observer){
        observers.remove(observer);
    }

    public int getTemperature() {
        return temperature;
    }

    public int getHumidity() {
        return humidity;
    }

    public int getPressure() {
        return pressure;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
    }
}
