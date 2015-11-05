package classwork.patterns.Observer;

/**
 * Created by CCowalsky on 05.11.2015.
 */
public class ObserverMain {
    public static void main(String[] args) {

        WeatherStation station = new WeatherStation();
        station.setPressure(20);
        station.setHumdity(50);
        station.setTemperature(10);

        station.measuremenChanged();

        System.out.println();
        station.setPressure(20);
        station.setHumdity(50);
        station.setTemperature(10);

        station.measuremenChanged();

    }
}
