package classwork.collections;

import java.util.Iterator;

/**
 * Created by CCowalsky on 26.10.2015.
 */
public class RecursivedLinkinList implements Iterable{

    private ListElements head;


    public int size() {
        if (head == null) {
            return 0;
        } else {
            return head.size();
        }
    }

    public void add(Object value) {
        if (head == null) {
            head = new ListElements(value);
        } else {
            head.add(value);
        }
    }

    public Object get(int index) {
        if (head == null) {
            return null;
        } else {
            return head.get(index);
        }
    }

    public ListElements getHead() {
        return head;
    }

    @Override
    public Iterator iterator() {
        return new LinkinListEterator(this);
    }
}
