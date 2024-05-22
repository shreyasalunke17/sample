package ExceptionHandling.FlowControl;
public class TryCatchFinally2
// Java program to demonstrate try-catch-finally when exception doesn't occurred in try block
{
    public static void main (String[] args)
    {
        try
        {
            String str = "123";
            int num = Integer.parseInt(str);
            // this statement will execute as no any exception is raised by above statement
            System.out.println("try block fully executed");
        }
        catch(NumberFormatException ex)
        {
            System.out.println("catch block executed...");
        }
        finally
        {
            System.out.println("finally block executed");
        }
        System.out.println("Outside try-catch-finally clause");
    }
}

/*
In this case,no matter whether an exception occurs in try-block or not finally will always be executed.
But control flow will depend on whether an exception has occurred in the try block or not.
*/


