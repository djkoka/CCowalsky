package classwork.generics;

/**
 * Created by CCowalsky on 03.12.2015.
 */
public class Emplayee extends Person {
    private int salary;

    public int getSalary() {
        return salary;
    }

    public Emplayee(String name, int salary ) {
        super(name);
        this.salary=salary;
    }
}
