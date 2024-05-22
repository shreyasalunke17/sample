package Collection.List.Vector;
import java.util.*;
public class RemovingElements
// Java code illustrating the removal of elements from vector
{
    public static void main(String[] args)
    {
        // Create default vector of capacity 10
        Vector v = new Vector();

        // Add elements using add() method
        v.add(1);
        v.add(2);
        v.add("Java");
        v.add("Collection Vector");
        v.add(4);

        // Removing first occurrence element at 1
        v.remove(1);

        // Checking vector
        System.out.println("after removal: " + v);
    }
}

