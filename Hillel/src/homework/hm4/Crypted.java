package homework.hm4;


/**
 * Created by djkoka on 07.10.2015.
 */
public class Crypted {
    String key;

    public Crypted(String key) {
        this.key = key;
    }

    public String crypt(String scr) {

        while (scr.length() > key.length()) {
            key = key + key;
        }

        char[] chars = scr.toCharArray();
        char[] mkey = key.toCharArray();
        char[] res = new char[chars.length];
        for (int i = 0; i < chars.length; i++) {
            res[i] = (char) (chars[i] ^ mkey[i]);

        }
        String crypted = String.copyValueOf(res);
        return crypted;
    }

}
