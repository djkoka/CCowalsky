package homework.hm4;


public class ImprovedArray {

    private int[] arrayPro;
    private int count;
    private int index;


    public ImprovedArray() {
        arrayPro = new int[2];
        count = 0;
    }


    public void add(int value) {
        if (count == arrayPro.length) {
            int[] copyArrayPro = new int[arrayPro.length * 2];
            for (int i = 0; i > arrayPro.length; i++) {
                copyArrayPro[i] = arrayPro[i];
            }
            arrayPro = copyArrayPro;
        }
        arrayPro[count] = value;
        count++;
    }

    public int get(int index) {
        return arrayPro[index];
    }

    public int size() {
        return count;
    }





}
