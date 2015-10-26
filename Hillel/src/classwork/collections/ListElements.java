package classwork.collections;

/**
 * Created by CCowalsky on 26.10.2015.
 */
public class ListElements {
    Object value;
    ListElements next;

    public ListElements(Object value) {

    }

    public int size() {
        if (next == null) {
            return 1;
        } else {
            return 1 + next.size();
        }
        //return next == null ? i
    }

    public void add(Object value) {
        if (next == null) {
            next = new ListElements(value);
        } else {
            next.add(value);
        }
    }

    public Object get(int index) {

        if (index == 0) {
            return value;
        } else {
            return next.get(index - 1);
        }
    }
}
