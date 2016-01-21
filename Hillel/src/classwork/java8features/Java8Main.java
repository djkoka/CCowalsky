package classwork.java8features;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import java.util.function.*;
import java.util.stream.Collectors;

/**
 * Created by CCowalsky on 14.01.2016.
 */
public class Java8Main {
    public static void main(String[] args) {


    }

    private static void functionEx() {
        List<Apple> apples = (createApple(10, (Supplier<Apple>) Apple::new));

        consumeApples(apples, new Consumer<Apple>() {
            @Override
            public void accept(Apple apple) {
                System.out.println(apple);
            }
        });

        consumeApples(apples, System.out::println);

        System.out.println(mapToString(apples, Apple::getColors));
    }

    public static List<String> mapToString(List<Apple> apples, Function<Apple,String> mapper){
        List<String> strings = new ArrayList<>();
        for (Apple apple: apples){
            strings.add(mapper.apply(apple));
        }
        return strings;
    }

    public static void consumeApples(List<Apple> apples, Consumer<Apple> consumer){
        for (Apple apple : apples){
            consumer.accept(apple);
        }
    }

    private static void stremEXp() {
        List<Apple> apples = new ArrayList<>();
        apples.add(new Apple("red", 140));
        apples.add(new Apple("green", 160));
        apples.add(new Apple("yellow", 360));
        apples.add(new Apple("red", 160));
        apples.add(new Apple("red", 200));


/*          List<Apple> redApples = filter(apples, redFiltr);
        List<Apple> redandheavyapple = filter(redApples, new Filtrator() {
            @Override
            public boolean test(Apple apple) {
                return apple.getWeight()>170;
            }
        });
        Filtrator redFiltr = new RedFilter();*/

        List<Apple> redandheavyapple = filter(apples, Java8Main::isHeavy);
        redandheavyapple = filter(apples, apple -> apple.getWeight() > 170);
        Predicate<Apple> isHeavy = Java8Main::isHeavy;
        Predicate<Apple> isGreen = apple -> apple.getColors().equals("red");
        Predicate<Apple> isHeavyandisGreen = isGreen.and(isHeavy);



        redandheavyapple = apples
                .stream()
                .filter(isHeavyandisGreen)
                .collect(Collectors.toList());

        List<String> colors = apples.stream()
                .map(Apple::getColors)
                //.limit(2)
                .distinct()
                .sorted()
                .collect(Collectors.toList());

        System.out.println();

        System.out.println(redandheavyapple);
    }

    public static List<Apple> createApple(int count, BiFunction<String, Integer, Apple> appleBiFunction) {
        List<Apple> apples = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            apples.add(appleBiFunction.apply("Red", 50));
        }
        return apples;
    }

    public static List<Apple> createApple(int count, Supplier<Apple> appleSupplier) {
        List<Apple> apples = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            apples.add(appleSupplier.get());
        }
        return apples;
    }

    private static boolean isHeavy(Apple apple) {
        return apple.getWeight() > 170;
    }

    private static List<Apple> filter(List<Apple> apples, Predicate<Apple> predicate) {
        List<Apple> resualt = new ArrayList<>();
        for (Apple apple : apples) {
            if (predicate.test(apple)) {
                resualt.add(apple);
            }
        }
        return resualt;
    }

    private static void defouldMethodEx() {
        Fruit fruit = new Apple();

        System.out.println(fruit.chop());

        List<Integer> integers = new ArrayList<>();
        integers.add(10);
        integers.add(4);
        integers.add(1);
        integers.add(8);
        integers.add(5);

        Collections.sort(integers);
        System.out.println(integers);

        integers.sort(Java8Main::sortIntAsc);
        integers.sort((o1, o2) -> o1.compareTo(o2));

        System.out.println(integers);
    }

    private static int sortIntAsc(Integer o1, Integer o2) {
        return o1.compareTo(o2);
    }
}
