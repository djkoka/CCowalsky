package classwork.patterns.Observer;

import java.util.Random;

/**
 * Created by CCowalsky on 09.11.2015.
 */
public class WeatherForcecast implements WeatherObserver {

    int temperature;
    int humidity;
    int pressure;

    public void updateWeather(WeatherStation station){
        this.temperature = generate(station.getTemperature());
        this.pressure = generate(station.getPressure());
        this.humidity = generate(station.getHumidity());

    }

    private int generate (int value){
        Random random = new Random();
        double seed = random.nextDouble();
        seed = seed - 0.5;
        seed = seed / 5;

        return (int) (value*(1+seed));
    }
    public void display(){
        System.out.println("forcecast: temperature "+
                temperature+" , pressure "+
                pressure+" , humidity "
                +humidity);
    }
}
