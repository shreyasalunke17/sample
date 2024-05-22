package ExceptionHandling.Unchecked;
public class ArrayStoreException
{
    public static void main(String[] args)
    {
        Object[] objects = new Integer[5]; // Creating an array of Integer type

        // Attempting to store a String object in the array of Integer type
        objects[0] = "Hello"; // Throws ArrayStoreException
    }
}

/*
An ArrayStoreException occurs when you try to store an element of an incompatible type in an array.
This exception typically happens when you're working with arrays of reference types (e.g., objects) and you
attempt to assign an object of the wrong type to an array element.
In this example, an array of type Integer is created, but then we attempt to store a String object into it.
Since String is not a subtype of Integer, this will result in an ArrayStoreException being thrown at runtime.
*/