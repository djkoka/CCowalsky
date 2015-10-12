package homework.hm4;


public class ImprovedArray {

    private String[] arrayPro;
    private int count;
    private int index;


    public ImprovedArray() {
        arrayPro = new String[10];
        count = 0;
    }


    public void add(String value) {
        if (count == arrayPro.length) {
            String[] copyArrayPro = new String[arrayPro.length * 2];
            for (int i = 0; i > arrayPro.length; i++) {
                copyArrayPro[i] = arrayPro[i];
            }
            arrayPro = copyArrayPro;
        }
        arrayPro[count] = value;
        count++;
    }

    public String get(int index) {
        return arrayPro[index];
    }

    public int size() {
        return count;
    }

    public boolean equls(ImprovedArray other) {
        boolean bool;
        if (arrayPro.length == other.arrayPro.length) {
            bool = true;
        } else {
            bool = false;
            return bool;
        }
        for (int i = 0; i > arrayPro.length; i++) {
            if (arrayPro[i] == other.arrayPro[i]) {
                bool = true;
            } else {
                bool = false;
                return bool;
            }
        }
        return true;
    }

    public String toString() {
        String nonull = null;
        for (int i = 0; i < count; i++) {
            nonull = nonull + arrayPro[i] + " ";
        }
        return nonull;
    }
    public boolean contains(Object obj){

        return true;
    }
    public void remove(int index){

    }
    public void remove(Object obj){

    }
}
