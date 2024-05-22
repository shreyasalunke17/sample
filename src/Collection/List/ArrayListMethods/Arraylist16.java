package Collection.List.ArrayListMethods;
import java.util.ArrayList;
public class Arraylist16
// Java code to demonstrate the working of trimTosize() method in ArrayList for ArrayList functions
{
    public static void main(String[] args)
    {
        // creating an Empty Integer ArrayList
        ArrayList<Integer> arr = new ArrayList<Integer>(9);

        // using add(), add 5 values
        arr.add(2);
        arr.add(4);
        arr.add(5);
        arr.add(6);
        arr.add(11);

        // trims the size to the number of elements
        arr.trimToSize();

        System.out.println("The List elements are:");

        // prints all the elements
        for (Integer number : arr)
        {
            System.out.println("Number = " + number);
        }
    }
}

/*
trimToSize(): This method is used to trim the capacity of the instance of the ArrayList to the list’s current size.
*/