package classwork.java8features;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * Created by CCowalsky on 14.01.2016.
 */
public class Java8Main {
    public static void main(String[] args) {
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

        redandheavyapple = apples
                .stream()
                .filter(Java8Main::isHeavy/* apple -> apple.getWeight() > 170 */)
                .filter(apple -> apple.getColors().equals("red"))
                .collect(Collectors.toList());

        System.out.println(redandheavyapple);

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
