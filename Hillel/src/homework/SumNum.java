package homework;


import org.junit.Test;

/**
 * Created by djkoka on 21.10.2015.
 */
public class SumNum {


    @Test
    public void testSumNum() {
        float[] floats = new float[4];
        floats[0] = 2.5f;
        floats[1] = 1.7f;
        floats[2] = 3.5f;
        floats[3] = 4.6f;
        double res = 0;

        for (int i = 0; i < floats.length; i++){
            res +=floats[i];
        }
        System.out.format("%.2f",res);
    }

}