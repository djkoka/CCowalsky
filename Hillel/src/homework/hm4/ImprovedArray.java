package homework.hm4;

import java.util.Arrays;

public class ImprovedArray {

    private int[] arrayPro = new int[2];
    private int count = 0;


    public void add(int i) {
        if (arrayPro.length == size()) {
            resize();
          }
        arrayPro[count] = i;
        count++;
    }

    public void resize(){
        arrayPro = Arrays.copyOf(arrayPro, arrayPro.length*2);
    }

    public int get(int index) {
        return arrayPro[index];
    }

    public int size() {
        return count;
    }


}
