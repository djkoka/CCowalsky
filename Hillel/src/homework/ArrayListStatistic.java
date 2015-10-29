package homework;


import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;


/**
 * Created by djkoka on 25.10.2015.
 */
public class ArrayListStatistic {
    public static void main(String[] args) {
        ArrayList list = fullArrayList();
        setToEnd(list);


    }
    public static ArrayList fullArrayList(){
        ArrayList list = new ArrayList<>();
        for (int i=0 ; i<123000;i++) {
            list.add(i);
        }
        return list;
    }
    public static void setToEnd(ArrayList list){
        Instant begin = Instant.now();

            list.set(122998,1);

        Instant end = Instant.now();

        Duration milsec = Duration.between(begin, end);
        System.out.println(milsec);
    }


/*    ArrayList list = new ArrayList();
    for (int i=0 ; i<123000;i++) {
        list.add(i);
    }
    Instant begin = Instant.now();

//some code

    Instant end = Instant.now();

    Duration milliseconds = Duration.between(begin, end);*/
}