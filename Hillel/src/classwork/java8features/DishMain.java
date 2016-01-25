package classwork.java8features;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

/**
 * Created by CCowalsky on 25.01.2016.
 */
public class DishMain {
    public static void main(String[] args) {
        List<Dish> menu = new ArrayList<>();

        menu.add(new Dish("Borsch", 500, true, DishType.OTHER));
        menu.add(new Dish("Pork", 800, false, DishType.MEAT));
        menu.add(new Dish("Salad", 100, true, DishType.OTHER));
        menu.add(new Dish("Shark", 500, true, DishType.FISH));
        menu.add(new Dish("Burger", 900, false, DishType.OTHER));
        menu.add(new Dish("Bulba", 300, true, DishType.OTHER));
        Dish whisky = new Dish("Whisky", 0, true, DishType.OTHER);
        menu.add(whisky);
        menu.add(new Dish("Mandarin", 120, true, DishType.OTHER));

        Predicate<Dish> lowCalories = dish -> dish.getCalories() < 500;

        Stream<Dish> lowCaloriesStream = menu
                .stream()
                .filter(lowCalories);
//        System.out.println(lowCaloriesStream.collect(Collectors.toList()));

        menu
                .stream()
                .collect(toList());

        lowCaloriesStream.forEach(System.out::println);
        menu
                .stream()
                .limit(2)
                .filter(lowCalories);
        long vegiCount = menu
                .stream()
                .filter(Dish::isVegi)
                .count();
        System.out.println(vegiCount + " vegies");

        System.out.println("Vegi and Calories");

        menu.stream()
                .filter(Dish::isVegi)
                .filter(dish -> dish.getCalories() > 100)
                .map(Dish::getName)
                .forEach(System.out::println);

        Predicate<Dish> meat = dish -> dish.getType() == DishType.MEAT;
        Predicate<Dish> meatAndHeavy = meat.and(dish -> dish.getCalories() < 500);

        boolean meatAndHeavyPresent = menu.stream()
                .anyMatch(meatAndHeavy);
        System.out.println("meat and heavy present in list: " + meatAndHeavyPresent);


        Predicate<Dish> nameIsNotNull = dish -> dish.getName() != null;
        boolean notNull = menu.stream().allMatch(nameIsNotNull);
        System.out.println("Null present in list: " + notNull);

        Predicate<Dish> isNotMeat = meat.negate();

        Predicate<Dish> isHealthy = isNotMeat.and(lowCalories);
        Optional<Dish> firstDish = menu.stream().filter(isHealthy).findFirst();

        if (firstDish.isPresent()) {
            System.out.println("Healthy dish is: " + firstDish.get().getName());
        } else {
            System.out.println("there is not Healthy food (");
        }

        System.out.println("Healthy dish is: " + firstDish.orElse(whisky));

        System.out.println("Healthy dish is: " + firstDish.orElseGet(Dish::new));

        //menu.parallelStream()

        Optional<String> reduced = menu.stream()
                .map(Dish::getName)
                .reduce((accumulator, dishName) -> accumulator + ", " + dishName);

        System.out.println(reduced.get());


    }
}
