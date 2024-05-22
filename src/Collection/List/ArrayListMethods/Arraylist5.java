package Collection.List.ArrayListMethods;
import java.util.ArrayList;
public class Arraylist5
// Java Program to Illustrate Working of clear() Method of ArrayList class Importing required classes
{
    public static void main(String[] args)
    {
        // Creating an empty Integer ArrayList
        ArrayList<Integer> arr = new ArrayList<Integer>(4);

        // Adding elements to above ArrayList using add() method
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);

        // Printing the elements inside current ArrayList
        System.out.println("The list initially: " + arr);

        // Clearing off elements using clear() method
        arr.clear();

        // Displaying ArrayList elements after using clear() method
        System.out.println("The list after using clear() method: " + arr);
    }
}
/*
clear(): This method is used to remove all the elements from any list.
*/












