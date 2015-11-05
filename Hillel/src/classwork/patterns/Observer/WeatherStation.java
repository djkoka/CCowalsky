package classwork.patterns.Observer;

/**
 * Created by CCowalsky on 05.11.2015.
 */
public class WeatherStation {
    int temperature;
    int humdity;
    int pressure;

    WeatherDisplay carrent = new WeatherDisplay();
    WeatherStatistic statistic = new WeatherStatistic();

    public void measuremenChanged(){

        carrent.set(temperature, humdity, pressure);
        carrent.display();

        statistic.set(temperature,humdity,pressure);
        statistic.display();
    }

    public int getTemperature() {
        return temperature;
    }

    public int getHumdity() {
        return humdity;
    }

    public int getPressure() {
        return pressure;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public void setHumdity(int humdity) {
        this.humdity = humdity;
    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
    }
}
