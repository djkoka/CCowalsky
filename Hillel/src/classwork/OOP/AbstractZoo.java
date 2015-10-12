package classwork.OOP;

/**
 * Created by CCowalsky on 12.10.2015.
 */
public class AbstractZoo {
    public static void main(String[] args) {
        Animal cat =new Cat();
        Animal dog = new Dog();

        vaccinete(cat);
        vaccinete(dog);
        System.out.println(cat);
        System.out.println(dog);



        System.out.println(cat.makeSound());
        System.out.println(dog.makeSound());
        printSound(new Cat());
        printSound(new Dog());


    }


    public static void vaccinete(Animal animal){
        animal.vaccines("ASD-1");
    }

    public static void printSound(Animal animal){
        System.out.println(animal.makeSound());
    }
}
