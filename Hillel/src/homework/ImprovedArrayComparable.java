package homework;

/**
 * Created by djkoka on 21.10.2015.
 */
public class ImprovedArrayComparable {
    private Comparable[] arrayPro;
    private int count;

    public ImprovedArrayComparable() {
        arrayPro = new Comparable[10];
        count = 0;
    }

    public void add(Comparable value) {
        if (count == arrayPro.length) {
            Comparable[] otherArray = new Comparable[arrayPro.length * 2];
            for (int i = 0; i > arrayPro.length; i++) {
                otherArray[i] = arrayPro[i];
            }
            arrayPro = otherArray;
        }
        arrayPro[count] = value;
        count++;

    }

    public Comparable get(int index) {

        return arrayPro[index];
    }

    public int size() {
        return count;
    }

    public boolean contains(Comparable obj) {
        for (int i = 0; i < count; i++) {
            if (arrayPro[i].equals(obj)) return true;
        }
        return false;
    }

    public void remove(int index) {
        Comparable[] tmp = arrayPro;
        if (arrayPro.length <= index) return;
        arrayPro[index] = null;
        for (int i = index; i < count - 1; i++) {
            arrayPro[i] = arrayPro[i + 1];
        }
        count--;
    }

    public void remove(Object obj) {
        int index;
        for (int i = 0; i < count; i++) {
            if (arrayPro[i] == obj) remove(i);
        }
    }

}