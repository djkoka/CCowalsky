package classwork.OOP.TDD;

import classwork.OOP.Cat;
import org.junit.Assert;
import org.junit.Test;

public class SortingTest {
    @Test
    public void sortIn() {
        Integer[] unsorted = {111, 555, 333, 444, 888, 777, 666,222};
        Sorter sorter = new Sorter();
        Integer[] sorted =(Integer[]) sorter.sort(unsorted);
        Integer[] expected = {111, 222, 333, 444, 555, 666, 777, 888};

        Assert.assertArrayEquals("Sorting is broken.", expected, sorted);


    }

    @Test
    public void catsShouldBeSortedByName(){
        Cat cat = new Cat(false,1," "," ");
        Cat cat1 = new Cat(false,1," "," " );
        Cat[] cats = new Cat[2];
        cats[0]=cat;
        cats[1]=cat1;

        Sorter sorter = new Sorter();
        Cat[] sorted = (Cat[])sorter.sort(cats);
        Cat[] expected = {cat1,cat};

        Assert.assertArrayEquals("",expected,sorted);
    }

    @Test
    public void sourceArrayShouldBeUnsorted(){
        Integer[] uncorted = {111, 222, 333, 444, 555, 666, 777, 888};
        Integer[] expected = {111, 222, 333, 444, 555, 666, 777, 888};

        Sorter sorter = new Sorter();
        sorter.sort(uncorted);

        Assert.assertArrayEquals("Source array ",uncorted,expected);
    }
}


