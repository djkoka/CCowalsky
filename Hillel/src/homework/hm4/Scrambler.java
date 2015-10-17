package homework.hm4;


/**
 * Created by djkoka on 07.10.2015.
 */
public class Scrambler {
    private String key;
    private String message;

    Scrambler(String key, String message) {
        this.key = key;
        this.message = message;
    }

    public String crypt() {

        char[] chars = message.toCharArray();
        char[] chars1 = key.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            chars[i] ^= chars1[i % chars1.length];
        }
        message = String.copyValueOf(chars);
        return message;


    }
}

