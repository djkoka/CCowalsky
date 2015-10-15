package classwork.OOP;

/**
 * Created by CCowalsky on 05.10.2015.
 */
public class Zoo {
    public static void main(String[] args) {
        Cat tomCat1 = new Cat(true,3,"","");
        String sound = tomCat1.makeSound();
        System.out.println(sound);

        //Animal animal = new Animal();
        Cat cat = new Cat();

        Animal anotherAnimal = new Cat();
        System.out.println(anotherAnimal.someField);
        System.out.println(anotherAnimal.getSomeField());

        System.out.println(anotherAnimal.getTypeName());

        //trash();


    }

    private static void trash() {
        String sound;Animal animalCat = new Cat();
        sound = animalCat.makeSound();
        System.out.println("cat as animal " + sound);

        Object cat3 = new Cat();
        cat3.equals(new Object());

        Object cat1 = new Cat(true,3,"","");
        Object cat2 = new Cat(true,3,"","");

        System.out.println("polymorphic equals: " + cat1.equals(cat2));

        Object[] objects = new Object[10];
        objects[1] = "some string";
        objects[2] = new Cat(true,3,"a", "2");
        objects[3] = System.in;

        for (Object o: objects){

        }
    }


    private static void eqalsExempl() {
        Cat tomCat1 =new Cat(true,3,"","");
        Cat tomCat2 =new Cat(true,3,"","");

        System.out.println(tomCat1.equals(tomCat2));
    }

    private static void srovnenie() {
        Cat tomCat1 =new Cat(true,3,"","");
        Cat tomCat2 =new Cat(true,3,"","");
        System.out.println(tomCat1==tomCat2);

        tomCat2=tomCat1;
        System.out.println(tomCat1==tomCat2);
    }

    private static void catCrations() {
        if (Cat.domestic) {
            System.out.println("cat is domestic animal");
        }
        if (Cat.predator) {
            System.out.println("cat is predator");
        }

        Cat tomCat = new Cat(true,3,"Tom","black");

        Cat murzik = new Cat(true,5,"Murzik","black");


        System.out.println(tomCat.getName());
        System.out.println(murzik.predator);
        System.out.println(murzik.getAge());
    }
}
