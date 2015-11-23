package classwork.IO;
import java.io.Serializable;
/**
 * Created by CCowalsky on 23.11.2015.
 */
public class Car implements Serializable{
    /*public static final long serialVersionUID = 1;*/
    String model;
    int age;
    CarOwner owner;
    String color;

    public Car(String model, int age, CarOwner owner, String color) {
        super();
        this.model = model;
        this.age = age;
        this.owner = owner;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", age=" + age +
                ", owner=" + owner +
                ", color='" + color + '\'' +
                '}';
    }
}
