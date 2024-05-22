package Collection.List.ArrayListMethods;
import java.util.ArrayList;
public class Arraylist3
// Java program to illustrate boolean addAll(Collection c)
{
    public static void main(String[] args)
    {
        // create an empty array list1 with initial capacity as 5
        ArrayList<Integer> arrlist1 = new ArrayList<Integer>(5);

        // use add() method to add elements in the list
        arrlist1.add(12);
        arrlist1.add(20);
        arrlist1.add(45);

        // prints all the elements available in list1
        System.out.println("Printing list1:");
        for (Integer number : arrlist1)
            System.out.println("Number = " + number);

        // create an empty array list2 with an initial capacity
        ArrayList<Integer> arrlist2 = new ArrayList<Integer>(5);

        // use add() method to add elements in list2
        arrlist2.add(25);
        arrlist2.add(30);
        arrlist2.add(31);
        arrlist2.add(35);

        // let us print all the elements available in list2
        System.out.println("Printing list2:");
        for (Integer number : arrlist2)
            System.out.println("Number = " + number);

        // inserting all elements, list2 will get printed after list1
        arrlist1.addAll(arrlist2);

        System.out.println("Printing all the elements");
        // let us print all the elements available in list1
        for (Integer number : arrlist1)
            System.out.println("Number = " + number);
    }
}

/*
addAll(Collection C):This method is used to append all the elements from a specific collection to the end of the
mentioned list, in such an order that the values are returned by the specified collection’s iterator.
*/