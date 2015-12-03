package classwork.generics;

import classwork.OOP.Emplayce;

/**
 * Created by CCowalsky on 03.12.2015.
 */
public class Manager extends Emplayee {


    public void fire(Emplayee emplayee){
        System.out.println(emplayee.getSalary()+"  ");
    }

    public Manager(String name, int salary) {
        super(name, salary);
    }
}
