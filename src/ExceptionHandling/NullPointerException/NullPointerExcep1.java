package ExceptionHandling.NullPointerException;
// A Java program to demonstrate that invoking a method on null causes NullPointerException
class NullPointerExcep1
{
    public static void main (String[] args)
    {
        // Initializing String variable with null value
        String ptr = null;
        // Checking if ptr.equals null or works fine.
        try
        {
            // This line of code throws NullPointerException because ptr is null
            if (ptr.equals("Hello Java"))
                System.out.print("Same");
            else
                System.out.print("Not Same");
        }
        catch(NullPointerException e)
        {
            System.out.print("NullPointerException Caught");
        }
    }
}


/*
NullPointerException is a RuntimeException. In Java, a special null value can be assigned to an object reference.
NullPointerException is thrown when a program attempts to use an object reference that has the null value.

*Reason for Null Pointer Exception
These are certain reasons for Null Pointer Exception as mentioned below:
Invoking a method from a null object.
Accessing or modifying a null object’s field.
Taking the length of null, as if it were an array.
Accessing or modifying the slots of null objects, as if it were an array.
Throwing null, as if it were a Throwable value.
When you try to synchronize over a null object.
------------------------------------------------------------------------------------------------------------------------
*Why do we need the Null Value?
Null is a special value used in Java. It is mainly used to indicate that no value is assigned to a reference variable.
One application of null is in implementing data structures like linked lists and trees. Other applications include the
Null Object pattern (See this for details) and the Singleton pattern. The Singleton pattern ensures that only one instance of a class is created and also, aims for providing a global point of access to the object.

A simple way to create at most one instance of a class is to declare all its constructors as private and then,
create a public method that returns the unique instance of the class:


How to Avoid the NullPointerException?
To avoid the NullPointerException, we must ensure that all the objects are initialized properly, before you use them.
When we declare a reference variable, we must verify that object is not null, before we request a method or a field from
the objects.
Following are the common problems with the solution to overcome that problem.

Case 1 : String comparison with literals
A very common case problem involves the comparison between a String variable and a literal. The literal may be a String
or an element of an Enum. Instead of invoking the method from the null object, consider invoking it from the literal.

Case 2 : Keeping a Check on the arguments of a method
Before executing the body of your new method, we should first check its arguments for null values and continue with
execution of the method, only when the arguments are properly checked. Otherwise, it will throw an IllegalArgumentException
and notify the calling method that something is wrong with the passed arguments.

Case 3 : Use of Ternary Operator
The ternary operator can be used to avoid NullPointerException. First, the Boolean expression is evaluated.
If the expression is true then, the value1 is returned, otherwise, the value2 is returned. We can use the ternary
operator for handling null pointers:
*/

