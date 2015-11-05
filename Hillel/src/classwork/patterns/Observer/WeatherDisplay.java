package classwork.patterns.Observer;

/**
 * Created by CCowalsky on 05.11.2015.
 */
public class WeatherDisplay {

    int temperature;
    int humdity;
    int pressure;

    public void set(int temperature,int humdity, int pressure){
        this.temperature = temperature;
        this.humdity = humdity;
        this.pressure = pressure;
    }
    public void display(){
        System.out.println("temperature: " + temperature+", humidity: "+humdity+", pressure: "+pressure);
    }
}
