/**
 * Created by CCowalsky on 24.09.2015.
 */
public class Operations {

    public static boolean paid() {

        System.out.println("in  paid method");
        return true;

    }

    public static boolean advert(){
        System.out.println("in advert method");
        return false;
    }

    public static void main(String[] args) {
        int res = 5+89;

        res = res +1;
        res +=1;
        res++;
        ++res;

        print(res++);//пост
        print(++res);//префикс



        int mod = 5%4;

        print(mod);
        boolean paid = true;
        boolean addwert = false;


//  || && короткая логика
        boolean hasEn = false;
        boolean canAttend = paid && hasEn;

        System.out.println(canAttend);

        canAttend = paid()|advert();
        System.out.println(canAttend);

        canAttend = paid() & advert();
        System.out.println(canAttend);


        int bitResult = 1;
        bitResult &= 50;


        int message = 100;
        int key = 31;

        System.out.println("message "+ message);
        int crypto = message ^ key;
        System.out.println("cryprto message "+crypto);

        int decrypto = crypto ^ key;
        System.out.println("decrypto nessage " +decrypto);

        boolean priorities = paid()| advert() & hasEnogh();



    }
    public static boolean hasEnogh(){
        System.out.println("in hasEnoghmethod");
        return true;

    }

    public static void print(int i) {
        System.out.println(i);

    }


}
