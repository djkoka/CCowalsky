package classwork.java8features;

/**
 * Created by CCowalsky on 14.01.2016.
 */
public class Apple implements Fruit{

    private String colors;
    private int weight;

    public Apple() {
    }

    public Apple(String colors, int weight) {
        this.colors = colors;
        this.weight = weight;
    }

    public String getColors() {
        return colors;
    }

    public int getWeight() {
        return weight;
    }
    @Override
    public String toString() {
        return "Apple{" +
                "colors='" + colors + '\'' +
                ", weight=" + weight +
                '}';
    }
    @Override
    public String getName() {
        return "Apple";
    }

    @Override
    public String chop() {
        return "Chopped apple";
    }
}
