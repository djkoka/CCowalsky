package classwork.patterns.Observer;

/**
 * Created by CCowalsky on 05.11.2015.
 */
public class ObserverMain {
    public static void main(String[] args) {

        WeatherStation station = new WeatherStation();
        WeatherDisplay current = new WeatherDisplay();
        WeatherStatistic statistic = new WeatherStatistic();
        WeatherForcecast forcecast = new WeatherForcecast();

        station.register(current);
        station.register(statistic);
        station.register(forcecast);

        station.setPressure(20);
        station.setHumidity(50);
        station.setTemperature(10);


        station.removeObs(current);
        station.measuremenChanged();


        current.display();
        statistic.display();
        forcecast.display();


        System.out.println();
        station.setPressure(20);
        station.setHumidity(50);
        station.setTemperature(10);

        station.measuremenChanged();

        current.display();
        statistic.display();
        forcecast.display();

    }
}
