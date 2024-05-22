package Collection.List.ArrayListMethods;
import java.util.ArrayList;
public class Arraylist10
// Java code to demonstrate the working of lastIndexOf() method in ArrayList for ArrayList functions
{
    public static void main(String[] args)
    {
        // creating an Empty Integer ArrayList
        ArrayList<Integer> arr = new ArrayList<Integer>(7);
        // using add() to initialize values
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(40);
        arr.add(30);
        arr.add(30);
        arr.add(40);

        System.out.println("The list initially " + arr);

        // last index of 30
        int element = arr.lastIndexOf(30);
        if (element != -1)
            System.out.println("the lastIndexof of" + " 30 is " + element);
        else
            System.out.println("30 is not present in" + " the list");

        // last index of 100
        element = arr.lastIndexOf(100);
        if (element != -1)
            System.out.println("the lastIndexof of 100" + " is " + element);
        else
            System.out.println("100 is not present in" + " the list");
    }
}

/*
lastIndexOf(Object O): The index of the last occurrence of a specific element is either returned or -1 in case the
element is not in the list.
*/











