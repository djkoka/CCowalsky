package classwork.generics;

/**
 * Created by CCowalsky on 03.12.2015.
 */
public class Manager extends Employee {


    public void fire(Employee employee){
        System.out.println(employee.getSalary()+"  ");
    }

    public Manager(String name, int salary) {
        super(name, salary);
    }
}
