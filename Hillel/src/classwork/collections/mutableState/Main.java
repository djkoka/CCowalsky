package classwork.collections.mutableState;


import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by CCowalsky on 02.11.2015.
 */
public class Main {

    public static void main(String[] args) {
        Set<Car> dreamList = new TreeSet<>(new CarComparator());

        Car peterDreams = new Car("Mercedes",2015);
        Car ivanDreams = new Car("Audi",2015);
        Car alexDreams = new Car("Porsche",2015);

        dreamList.add(ivanDreams);
        dreamList.add(peterDreams);
        dreamList.add(alexDreams);

        System.out.println(dreamList);

        dreamList.remove(alexDreams);

        //alexDreams.model = "Acura";
        dreamList.add(alexDreams);

        System.out.println("ivan dream is in list " + dreamList.contains(ivanDreams));
        System.out.println("peter dream is in list " + dreamList.contains(peterDreams));
        System.out.println("alex dream is in list " + dreamList.contains(alexDreams));

        System.out.println(dreamList);


        dreamList.remove(alexDreams);
        alexDreams = new Car("Porsche",2015);
        dreamList.add(alexDreams);

        System.out.println(dreamList);

        String s= "asd";

        String copy = s;
        s+="aaa";

        System.out.println(copy == s);


        Integer i = 1;
        Integer copyI = i;
        i++;
        System.out.println(i == copyI);


        Set<Car> hashedCars = new HashSet<>();
        hashedCars.add(alexDreams);
        hashedCars.add(peterDreams);
        hashedCars.add(ivanDreams);


        Car seekedCar = new Car("Porsche", 2015);
        System.out.println("hash code is: "+ seekedCar.hashCode());
        System.out.println("hashSet contains porsche: " + hashedCars.contains(seekedCar));
    }
}
