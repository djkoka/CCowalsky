package classwork.generics;

import sun.security.krb5.internal.PAData;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by CCowalsky on 03.12.2015.
 */
public class Main {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Ivan ", 4500));
        employeeList.add(new Manager("Petro", 5000));
        print(employeeList);

        List<Manager> managerList = new ArrayList<>();
        managerList.add(new Manager("Ivan ", 4500));
        managerList.add(new Manager("Petro", 5000));
        print(managerList);

        addEmployee(employeeList);

        List<Person> personList = new ArrayList<>();
        personList.add(new Person("alex"));

        addEmployee(personList);

        List<Employee> copyEmployeeList = new ArrayList<>();

        copy(employeeList,copyEmployeeList);

        System.out.println(copyEmployeeList.size());

        //managerList = copy(employeeList, managerList);
        copy(managerList, employeeList);
    }

    //public static void overloadedMethod(List<String> strings){}
    public static void overloadedMethod(List<Integer> integers){

    }

    public static <K,V> void copy(Pair<K,V> source, Pair<K,V> target ){
        target.key = source.key;
        target.value = source.value;
    }

    public static <T> List<? super T> copy(List<? extends T> source, List<? super T> target){
        target.addAll(source);
        return target;
    }

    public static <T> List<T> copyFun(List<? extends T> source){
        List<T> target = new ArrayList<>();
        target.addAll(source);
        return target;
    }

    public static void addEmployee(List<? super Employee> list){
        list.add(new Employee("",5));
    }

    public static void print(List<? extends Employee> list){
        for (Employee e: list){
            System.out.println(e);

        }

    }

    private static void rawTypeExample() {
        List<Employee> employeeList = new ArrayList<>();

        employeeList.add(new Employee("Ivan ", 4500));
        employeeList.add(new Manager("Petro", 5000));

        printEmplayee(employeeList);

        List<Employee> personList = employeeList;
        printPersons(personList);

        //personList.add(new Person("Anotoliy"));
        printPersons(personList);

        printEmplayee(employeeList);
    }

    private static void printEmplayee(List<Employee> employeeList) {
        for (Employee e : employeeList) {
            System.out.println(e);
        }
    }

    private static void printPersons(List personList) {
        for (Object o : personList) {
            Person p = (Person) o;
            System.out.println(p);
        }
    }

    private static void simpleExemples() {
        Employee e = new Manager("ivan", 500);
        ArrayList<Employee> arrayList = new ArrayList<>();

        List<Employee> list = arrayList;

        Collection<Employee> collection = list;

        //list.add(new Person("ivan"));

        list.add(new Employee("", 4));
        list.add(new Manager("", 4));
    }

    private static void pairExample() {
        List<Person> list = new ArrayList<>();

        list.add(new Person("Vasya"));
        //list.add(new Object());

        Person vasya = list.get(0);
        Object o = list.get(1);

        list.add(new Employee("petr", 10));

        Pair<Employee, Manager> pair = new Pair<>();

        Employee e = pair.key;
        Manager m = pair.value;
    }
}
