package homework.hm4;

import java.util.Scanner;

/**
 * Created by djkoka on 06.10.2015.
 */
public class RectangleTask {
    private double sq;
    private double per;
    
    public RectangleTask(double sq,double per){
        this.sq=sq;
        this.per=per;
    }

    public boolean hasSolution(){
        return Math.sqrt(Math.pow(per, 2)/4-4*sq)>0;
    }

    public Rectangle getRectangle(){
        if (hasSolution()){
            double b =(per/2 +Math.sqrt(Math.pow(per,2)/4-4*sq))/2;
            double a =sq/b;
            Rectangle rectangle = new Rectangle(a,b);
            return rectangle;
        }else return null;
    }
}
