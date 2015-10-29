package classwork.collections;

import java.util.Iterator;

/**
 * Created by CCowalsky on 29.10.2015.
 */
public class LinkinListEterator implements Iterator {
    private final RecursivedLinkinList list;
    ListElements element;

    public LinkinListEterator(RecursivedLinkinList list) {
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        if (element == null) {
            return list.getHead() != null;
        }
        return element.next != null;
    }

    @Override
    public Object next() {
        if (element == null){
            element = list.getHead();
        }else {
            element = element.next;
        }return element.value;
    }
}
