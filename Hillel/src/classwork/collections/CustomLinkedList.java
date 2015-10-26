package classwork.collections;

/**
 * Created by CCowalsky on 26.10.2015.
 */
public class CustomLinkedList {

    private ListElements head;

    public int size() {

        if ( head == null){
            return 0;
        }else {
            ListElements current = head;
            int count = 1;
            while (current.next != null) {
                current = current.next;
                count++;
            }return count;
        }
    }

    public void add(Object value) {
        if (head == null){
            head= new ListElements(value);
        } else {
            ListElements current = head;

            while (current.next != null){
                current = current.next;
            }
            current.next = new ListElements(value);
        }

    }

    public Object get(int index) {
        if (head == null){
            return null;
        }else{
            ListElements current = head;
            for (int i = index;i != 0; i--){
                if (current.next==null){
                    return null;
                }
                current = current.next;
            }
            return current.next;
        }
    }
}
