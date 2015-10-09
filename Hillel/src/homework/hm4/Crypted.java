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

        char[] chars = scr.toCharArray();
        char[] mkey = key.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (i >= mkey.length) {
                chars[i] ^= mkey[i % mkey.length];
            } else {
                chars[i] ^= mkey[i];
            }
        }
        String crypted = String.copyValueOf(chars);
        return crypted;


    }
}

