package homework.hm4;

import java.util.Scanner;

/**
 * Created by djkoka on 21.10.2015.
 */
public class Example {
    public static void main(String[] args) {
        ImprovedArray array = new ImprovedArray();
        for (int i = 0; i<11; i++){
            array.add("This " +i);
        }
        System.out.println("Bla bla bla "+ array.size());
        Scanner scan =new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println(array.get(n));
        System.out.println(array.toString());
    }
}
