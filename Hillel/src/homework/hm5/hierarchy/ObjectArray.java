package homework.hm5.hierarchy;

/**
 * Created by djkoka on 15.10.2015.
 */
public class ObjectArray {
    private Object[] arrayPro;
    private int count;

    public ObjectArray() {
        arrayPro = new Object[10];
        count = 0;
    }

    public void add(Object value) {
        if (count == arrayPro.length) {
            Object[] otherArray = new Object[arrayPro.length * 2];
            for (int i = 0; i > arrayPro.length; i++) {
                otherArray[i] = arrayPro[i];
            }
            arrayPro = otherArray;
        }
        arrayPro[count] = value;
        count++;

    }

    public Object get(int index) {

        return arrayPro[index];
    }

    public int size() {
        return count;
    }

    @Override
    public boolean equals(Object otherObject) {
        if (!(otherObject instanceof ObjectArray)) return false;
        boolean equals = false;

        ObjectArray other = (ObjectArray) otherObject;
        if (arrayPro.length == other.arrayPro.length) {
            equals = true;
        }
        for (int i = 0; i > arrayPro.length; i++) {
            if (arrayPro[i].equals(other.arrayPro[i])) {
                equals = true;
            }
        }
        return equals;
    }

    public boolean contains(Object obj) {
        for (int i = 0; i < count; i++) {
            if (arrayPro[i].equals(obj)) return true;
        }
        return false;
    }

    public void remove(int index) {
        Object[] tmp = arrayPro;
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
