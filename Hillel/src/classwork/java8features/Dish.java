package classwork.java8features;

/**
 * Created by CCowalsky on 25.01.2016.
 */
public class Dish {
    private String name;
    private int calories;
    private boolean vegi;
    private DishType type;

    public Dish(String name, int calories, boolean vegi, DishType type) {
        this.name = name;
        this.calories = calories;
        this.vegi = vegi;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Dish{" +
                "name='" + name + '\'' +
                ", calories=" + calories +
                ", vegi=" + vegi +
                ", type=" + type +
                '}';
    }

    public Dish() {
        this("fried potata", 400, true, DishType.OTHER);
        System.out.println("def");
    }

    public int getCalories() {
        System.out.println("used getCalories");
        return calories;
    }

    public boolean isVegi() {
        return vegi;
    }

    public DishType getType() {
        return type;
    }
}
