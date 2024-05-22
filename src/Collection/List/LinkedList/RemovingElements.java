package Collection.List.LinkedList;
import java.util.*;
public class RemovingElements
// Java program to remove elements in a LinkedList
{
    public static void main(String[] args)
    {
        LinkedList<String> ll = new LinkedList<>();

        ll.add("Java");
        ll.add("Coding");
        ll.add(1, "Programming");

        System.out.println("Initial LinkedList "+ll);

        // Function call
        ll.remove(1);

        System.out.println("After the Index Removal "+ll);

        ll.remove("Coding");

        System.out.println("After the Object Removal "+ll);
    }
}

