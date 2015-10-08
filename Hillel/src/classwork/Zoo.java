package classwork;

/**
 * Created by CCowalsky on 05.10.2015.
 */
public class Zoo {
    public static void main(String[] args) {
        if (Cat.domestic) {
            System.out.println("cat is domestic animal");
        }
        if (Cat.predator) {
            System.out.println("cat is predator");
        }

        Cat tomCat = new Cat(true,3,"Tom","black");

        Cat murzik = new Cat(true,5,"Murzik","black");



        System.out.println(tomCat.name);
        System.out.println(murzik.predator);
        System.out.println(murzik.age);
    }
}
