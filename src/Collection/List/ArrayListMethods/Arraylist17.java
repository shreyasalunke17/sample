package Collection.List.ArrayListMethods;
import java.util.ArrayList;
import java.util.List;
public class Arraylist17
// Java program to demonstrate working of Objectp[] toArray()
{
    public static void main(String[] args)
    {
        List<Integer> al = new ArrayList<Integer>();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);

        Object[] objects = al.toArray();

        // Printing array of objects
        for (Object obj : objects)
            System.out.print(obj + " ");
    }
}

/*
toArray(): This method is used to return an array containing all of the elements in the list in the correct order.
toArray(Object[] O): It is also used to return an array containing all of the elements in this list in the correct
order same as the previous method.
*/