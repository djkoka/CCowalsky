package classwork.generics;

/**
 * Created by CCowalsky on 03.12.2015.
 */
public class Employee extends Person {
    private int salary;

    public int getSalary() {
        return salary;
    }

    public Employee(String name, int salary) {
        super(name);
        this.salary=salary;
    }
}
