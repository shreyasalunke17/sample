package Collection.List.Vector.Stack;
import java.util.*;
public class AddingElements
// Java program to add the elements in the stack
{
    public static void main(String[] args)
    {
        // Default initialization of Stack
        Stack stack1 = new Stack();

        // Initialization of Stack using Generics
        Stack<String> stack2 = new Stack<String>();

        // pushing the elements
        stack1.push("4");
        stack1.push("All");
        stack1.push("Geeks");

        stack2.push("Geeks");
        stack2.push("For");
        stack2.push("Geeks");

        // Printing the Stack Elements
        System.out.println(stack1);
        System.out.println(stack2);
    }
}

