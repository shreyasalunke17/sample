package ExceptionHandling.MethodOverriding;
//Java Program to Illustrate Exception Handling with Method Overriding
//Where SuperClass declares an exception and SubClass declares without exception
import java.io.*;
class SuperClass4
{
    // SuperClass declares an exception
    void method() throws IOException
    {
        System.out.println("SuperClass");
    }
}
class SubClass4 extends SuperClass4
{
    // SubClass declaring without exception
    void method()
    {
        System.out.println("SubClass");
    }
    public static void main(String[] args)
    {
        SuperClass4 s = new SubClass4();
        try
        {
            s.method();
        } catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}


/*
Case 3: If SuperClass declares an exception and SubClass declares without exception.
*/

/**
 Conclusions:
 *As perceived from above 3 examples in order to handle such exceptions,the following conclusions derived are as follows:

 1)If SuperClass does not declare an exception, then the SubClass can only declare unchecked exceptions, but not the
 checked exceptions.
 2)If SuperClass declares an exception, then the SubClass can only declare the same or child exceptions of the exception
 declared by the SuperClass and any new Runtime Exceptions, just not any new checked exceptions at the same level or higher.
 3)If SuperClass declares an exception, then the SubClass can declare without exception.
 */
