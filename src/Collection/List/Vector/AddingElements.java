package Collection.List.Vector;
import java.util.*;
public class AddingElements
// Java Program to Add Elements in Vector Class Importing required classes
{
    public static void main(String[] arg)
    {
        // Case 1 Creating a default vector
        Vector v1 = new Vector();

        // Adding custom elements using add() method
        v1.add(1);
        v1.add(2);
        v1.add("Java");
        v1.add("Vector Programs");
        v1.add(3);

        // Printing the vector elements to the console
        System.out.println("Vector v1 is " + v1);

        // Case 2 Creating generic vector
        Vector<Integer> v2 = new Vector<Integer>();

        // Adding custom elements using add() method
        v2.add(1);
        v2.add(2);
        v2.add(3);

        // Printing the vector elements to the console
        System.out.println("Vector v2 is " + v2);
    }
}








