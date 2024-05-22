package ExceptionHandling.FlowControl;
public class ExceptionRaised
//Java program to demonstrate control flow of try-finally clause when exception occur in try block
{
    public static void main (String[] args)
    {
        // array of size 4
        int[] arr = new int[4];
        try
        {
            int i = arr[4];
            // this statement will never execute as exception is raised by above statement
            System.out.println("Inside try block");
        }
        finally
        {
            System.out.println("finally block executed");
        }
        // rest program will not execute
        System.out.println("Outside try-finally clause");
    }
}


/*
1.Exception raised: If an exception has occurred in the try block then the control flow will be finally block
followed by the default exception handling mechanism.
*/






