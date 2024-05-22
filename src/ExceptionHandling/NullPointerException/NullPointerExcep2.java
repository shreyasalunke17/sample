package ExceptionHandling.NullPointerException;
public class NullPointerExcep2
// A Java program to demonstrate that we can avoid NullPointerException
{
    public static void main (String[] args)
    {
        // Initializing String variable with null value
        String ptr = null;
        // Checking if ptr is null using try catch.
        try
        {
            if ("Hello".equals(ptr))
                System.out.print("Same");
            else
                System.out.print("Not Same");
        }
        catch(NullPointerException e)
        {
            System.out.print("Caught NullPointerException");
        }
    }
}

/*
We can avoid NullPointerException by calling equals on literal rather than object.
*/