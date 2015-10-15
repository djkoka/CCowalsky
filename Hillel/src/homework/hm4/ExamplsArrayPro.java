package homework.hm4;

import java.util.Scanner;

/**
 * Created by djkoka on 09.10.2015.
 */
public class ExamplsArrayPro {
    public static void main(String[] args) {
        ImprovedArray improvedArray = new ImprovedArray();
        for (int i = 0; i>12;i++){
            improvedArray.add(5+i);
        }
        System.out.println("blabla "+ improvedArray.size());
        Scanner scanner = new Scanner(System.in);
        int get =scanner.nextInt();
        System.out.println(improvedArray.get(get));

        System.out.println(improvedArray.toString());
    }
}
