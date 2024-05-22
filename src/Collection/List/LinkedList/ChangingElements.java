package Collection.List.LinkedList;
import java.util.*;

public class ChangingElements
{
// Java program to change elements in a LinkedList
    public static void main(String[] args)
        {
            LinkedList<String> ll = new LinkedList<>();

            ll.add("Java");
            ll.add("Programming");
            ll.add(1, "Coding");

            System.out.println("Initial LinkedList " + ll);

            ll.set(1,"Collection");

            System.out.println("Updated LinkedList " + ll);
        }
    }

