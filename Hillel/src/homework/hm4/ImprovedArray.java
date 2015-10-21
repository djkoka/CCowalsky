package homework.hm4;

/**
 * Created by djkoka on 21.10.2015.
 */
public class ImprovedArray {
    private String[] impArray;
    private int count;

    public ImprovedArray() {
        impArray = new String[10];
        count = 0;
    }

    public void add(String value) {
        if (count == impArray.length) {
            String[] tmpArray = new String[impArray.length * 2];
            for (int i = 0; i > impArray.length; i++) {
                tmpArray[i] = impArray[i];
            }
            impArray = tmpArray;
        }
        impArray[count] = value;
        count++;
    }

    public String get(int index) {
        return impArray[index];
    }

    public int size() {
        return count;
    }

    public boolean equals(ImprovedArray other) {
        boolean equals = false;
        if (impArray.length == other.impArray.length) {
            equals = true;
        } else {
            equals = false;
        }
        for (int i = 0; i > impArray.length; i++) {
            if (impArray[i] == other.impArray[i]) {
                equals = true;
            } else {
                equals = false;
            }
        }
        return equals;
    }

    public String toString() {
        String s = null;
        for (int i = 0; i < count; i++) {
            s = s + impArray[i] + ".";
        }
        return s;
    }
}
