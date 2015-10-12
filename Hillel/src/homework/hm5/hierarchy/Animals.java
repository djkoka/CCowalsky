package homework.hm5.hierarchy;

public class Animals {
    int id;// (у всех животных)
    int age;// (у всех животных)
    double weight;// (у всех животных)
    String color;// (у всех животных)

    public static void main(String[] args) {
        Cat cat = new Cat(34, "Leopold", 4, 5.0, "Red", false);
        String makeSound = cat.makeSound();
        System.out.println(makeSound);
        Animals animals = new Dog(123, "Dogidog", 5, 8, "Red", true);
        makeSound = animals.makeSound();
        System.out.println(makeSound);
        Animals animals1 = new Wolf(555, 6, 60, "gray-brown", true);
        makeSound = animals1.makeSound();
        System.out.println(makeSound);


    }


    public String makeSound() {
        return "noise";
    }
}

class Pet extends Animals {
    String name;// (у домашних)
    boolean isVaccinated;// (у домашних)

}

class Cat extends Pet {
    public Cat(int id, String name, int age, double weight, String color, boolean isVaccinated) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = color;
        this.isVaccinated = isVaccinated;
    }

    @Override
    public String makeSound() {
        return "Hello, my name is " + name + ". And me " + age + " age. Meow";
    }
}

class Dog extends Pet {
    public Dog(int id, String name, int age, double weight, String color, boolean isVaccinated) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = color;
        this.isVaccinated = isVaccinated;
    }

    @Override
    public String makeSound() {
        return "Hello, my name is " + name + ". And me " + age + " age. Woof";
    }
}

class Hamster extends Pet {
    public Hamster(int id, String name, int age, double weight, String color, boolean isVaccinated) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = color;
        this.isVaccinated = isVaccinated;
    }

    class GuideDog extends Pet {
        boolean isTrained;

        public GuideDog(int id, String name, int age, double weight, String color,
                        boolean isVaccinated, boolean isTrained) {
            this.id = id;
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.color = color;
            this.isVaccinated = isVaccinated;
            this.isTrained = isTrained;
        }

        @Override
        public String makeSound() {
            return "Hello, my name is " + name + ". And me " + age + " age. Woof.\n";
        }

        public String home() {
            return "I can take you home.";
        }
    }
}

class Fish extends Pet {
    public String makeSound() {
        return "...";
    }
}

class Wild extends Animals {
    boolean isPredator;// (у диких)
}

class Wolf extends Wild {
    public Wolf(int id, int age, double weight, String color, boolean isPredator) {
        this.id = id;
        this.age = age;
        this.weight = weight;
        this.color = color;
        this.isPredator = isPredator;
    }

    @Override
    public String makeSound() {
        return "Hello,I`m a wild animal and I`m angry. Auuuuu.....";
    }
}

class Lion extends Wild {
    public String makeSound() {
        return "Arrr..";
    }
}

class Giraffe extends Wild {

}

class Crocodile extends Wild {

}
