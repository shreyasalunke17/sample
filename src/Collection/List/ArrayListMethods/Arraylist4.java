package Collection.List.ArrayListMethods;
import java.util.ArrayList;
public class Arraylist4
// Java program to illustrate boolean addAll(int index, Collection c)
{
    public static void main(String[] args)
    {

        // create an empty array list1 with initial capacity 5
        ArrayList<Integer> arrlist = new ArrayList<Integer>(5);

        // using add() method to add elements in the list
        arrlist.add(12);
        arrlist.add(20);
        arrlist.add(45);

        // prints all the elements available in list1
        System.out.println("Printing list1:");
        for (Integer number : arrlist)
            System.out.println("Number = " + number);

        // create an empty array list2 with an initial capacity
        ArrayList<Integer> arrlist2 = new ArrayList<Integer>(5);

        // use add() method to add elements in list2
        arrlist2.add(25);
        arrlist2.add(30);
        arrlist2.add(31);
        arrlist2.add(35);

        // prints all the elements available in list2
        System.out.println("Printing list2:");
        for (Integer number : arrlist2)
            System.out.println("Number = " + number);

        // inserting all elements of list2 at third
        // position
        arrlist.addAll(2, arrlist2);

        System.out.println("Printing all the elements");

        // prints all the elements available in list1
        for (Integer number : arrlist)
            System.out.println("Number = " + number);
    }
}

/*
addAll(int index, Collection C): Used to insert all of the elements starting at the specified position from a specific
collection into the mentioned list.
*/