package ExceptionHandling.FlowControl;
public class ExceptionNotRaised
//Java program to demonstrate control flow of try-finally clause when exception doesn't occur in try block
{
    public static void main (String[] args)
    {
        try
        {
            String str = "123";
            int num = Integer.parseInt(str);
            // this statement will execute as no any exception is raised by above statement
            System.out.println("Inside try block");
        }
        finally
        {
            System.out.println("finally block executed");
        }
        // rest program will be executed
        System.out.println("Outside try-finally clause");
    }
}

/*
2.Exception not raised: If an exception does not occur in the try block then the control flow will be finally
block followed by the rest of the program
*/
























